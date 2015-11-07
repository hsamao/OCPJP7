package com.samao.ocpjp.chapter10.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by hsamao on 11/7/15.
 */
public class DbTransaction {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        ResultSet resultSet1 = null, resultSet2 = null;
        try {
            connection = DbConnectorUtility.connectToDB();
            System.out.println("connected successfully to database");
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            resultSet1 = statement.executeQuery("SELECT * FROM FAMILY_GROUP;");
            resultSet1.moveToInsertRow();
            resultSet1.updateString("NICKNAME", "Sam Uncle");
            resultSet1.insertRow();
            System.out.println("New record is added to FAMILY_GROUP table");

            resultSet2 = statement.executeQuery("SELECT * FROM contact;");
            resultSet2.moveToInsertRow();
            resultSet2.updateString("firstName", "Samuel");
            resultSet2.updateString("lastName", "Uncle");
            resultSet2.updateString("email", "sam@gmail.com");
            resultSet2.updateString("phoneNo", "+1199554433");
            resultSet2.insertRow();
            System.out.println("Both tables updated, committing now. ");
            connection.commit();

        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (connection != null) connection.close();
            if (resultSet1 != null) resultSet1.close();
            if (resultSet2 != null) resultSet2.close();


        }
    }
}
