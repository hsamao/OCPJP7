package com.samao.ocpjp.chapter10.jdbc;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by hsamao on 11/6/15.
 */
public class DbQuery4 {

    public static void main(String[] args) {

        try (Connection connection = DbConnectorUtility.connectToDB()) {

            String sql = "select firstName, email FROM contact WHERE firstName = \"Michael\";";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            System.out.println("FIRST_NAME \t EMAIL");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("firstName") + "\t" +
                        resultSet.getString("email"));
            }

        } catch (Exception ex) {
            System.out.println("Failed");
            System.out.println(ex.getMessage());
        }
    }
}
