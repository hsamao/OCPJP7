package com.samao.ocpjp.chapter10.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by hsamao on 11/6/15.
 */
public class DbUpdate {
    public static void main(String[] args) throws Exception {

        try (Connection connection = DbConnectorUtility.connectToDB()) {
            String sql = "Select * from contact where firstName = \"Michael\";";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            System.out.println("Before update");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + "\t" +
                        resultSet.getString("firstName") + "\t" +
                        resultSet.getString("lastName") + "\t" +
                        resultSet.getString("email") + "\t" +
                        resultSet.getString("phoneNo"));
            }


            resultSet.absolute(1);
            resultSet.updateString("phoneNo", "+91987654321");

            System.out.println("After update");

            resultSet.beforeFirst();

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + "\t" +
                        resultSet.getString("firstName") + "\t" +
                        resultSet.getString("lastName") + "\t" +
                        resultSet.getString("email") + "\t" +
                        resultSet.getString("phoneNo"));
            }

        } catch (Exception ex) {
            System.out.println("Failed");
            System.out.println(ex.getMessage());
        }
    }
}
