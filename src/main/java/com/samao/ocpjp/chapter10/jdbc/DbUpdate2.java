package com.samao.ocpjp.chapter10.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by hsamao on 11/6/15.
 */
public class DbUpdate2 {

    public static void main(String[] args) throws SQLException {

        try (Connection connection = DbConnectorUtility.connectToDB()) {

            String sql = "SELECT * FROM CONTACT " +
                    "WHERE firstName = \"William\";";
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet = statement.executeQuery(sql);

            System.out.println("Before Update");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + "\t" +
                        resultSet.getString("firstName") + "\t" +
                        resultSet.getString("lastName") + "\t" +
                        resultSet.getString("email") + "\t" +
                        resultSet.getString("phoneNo"));
            }

            resultSet.absolute(1);
            resultSet.updateString("email", "william@gmail.com");
            resultSet.updateRow();

            System.out.println("After Update");

            resultSet.beforeFirst();

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + "\t" +
                        resultSet.getString("firstName") + "\t" +
                        resultSet.getString("lastName") + "\t" +
                        resultSet.getString("email") + "\t" +
                        resultSet.getString("phoneNo"));
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
