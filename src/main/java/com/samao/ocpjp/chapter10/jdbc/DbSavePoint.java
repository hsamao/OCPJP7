package com.samao.ocpjp.chapter10.jdbc;

import java.sql.*;

/**
 * Created by hsamao on 11/7/15.
 */
public class DbSavePoint {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        ResultSet resultSet = null;

        try {
            connection = DbConnectorUtility.connectToDB();
            System.out.println("Connected to database successfully");
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            resultSet = statement.executeQuery("SELECT * FROM FAMILY_GROUP;");
            System.out.println("FAMILY_GROUP contents before updating ");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("NICKNAME"));
            }

            resultSet.moveToInsertRow();
            resultSet.updateString("NICKNAME", "TOM");
            resultSet.insertRow();
            System.out.println("Inserted row for Tom");
            Savepoint firstSavePoint = connection.setSavepoint();

            resultSet.moveToInsertRow();
            resultSet.updateString("NICKNAME", "Dick ");
            resultSet.insertRow();
            System.out.println("Inserted row for Dick");
            Savepoint secondSavePoint = connection.setSavepoint();

            resultSet.moveToInsertRow();
            resultSet.updateString("NICKNAME", "Harry");
            resultSet.insertRow();
            Savepoint thirdSavePoint = connection.setSavepoint();
            System.out.println("Inserted row for Harry");

            connection.rollback(secondSavePoint);
            System.out.println("Rolled back to previous last insertion");
            connection.commit();

            System.out.println("FAMILY_GROUP AFTER UPDATING\n");

          resultSet.beforeFirst();
            while (resultSet.next()) {
                System.out.println(resultSet.getString("NICKNAME"));
            }


        } catch (SQLException ex) {
            connection.rollback();
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Failed");
            System.out.println(ex.getMessage());
        } finally {
            if (connection != null) connection.close();
            if (resultSet != null) resultSet.close();
        }
    }
}
