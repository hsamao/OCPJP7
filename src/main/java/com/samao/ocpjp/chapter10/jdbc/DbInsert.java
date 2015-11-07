package com.samao.ocpjp.chapter10.jdbc;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by hsamao on 11/6/15.
 */
public class DbInsert {

    public static void main(String[] args) throws SQLException {

        try (Connection connection = DbConnectorUtility.connectToDB()) {
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet = statement.executeQuery("SELECT * FROM contact");

            System.out.println("BEFORE INSERTION");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + "\t" +
                        resultSet.getString("firstName") + "\t" +
                        resultSet.getString("lastName") + "\t" +
                        resultSet.getString("email") + "\t" +
                        resultSet.getString("phoneNo"));
            }

            resultSet.moveToInsertRow();
            resultSet.updateString("firstName", "Bob");
            resultSet.updateString("lastName", "Bill");
            resultSet.updateString("email", "bill@gmail.com");
            resultSet.updateString("phoneNo", "+96477130144");
            resultSet.insertRow();

            resultSet.beforeFirst();

            System.out.println("AFTER INSERTION");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + "\t" +
                        resultSet.getString("firstName") + "\t" +
                        resultSet.getString("lastName") + "\t" +
                        resultSet.getString("email") + "\t" +
                        resultSet.getString("phoneNo"));
            }


        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
