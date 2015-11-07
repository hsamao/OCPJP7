package com.samao.ocpjp.chapter10.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by hsamao on 11/6/15.
 */
public class DbQuery {

    public static void main(String[] args) {

        try (Connection connection = DbConnectorUtility.connectToDB()) {
            String sql = "Select * from Contact;";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            System.out.println("----------------------------------------------------------");
            System.out.println(" Id \t firstName \t lastName\t\t email\t\t\t phoneNo");
            System.out.println("----------------------------------------------------------");

            /*int numOfColumns = resultSet.getMetaData().getColumnCount();
            while (resultSet.next()){
                for (int i = 1; i <= numOfColumns; i++){
                    System.out.print(resultSet.getObject(i) + "\t");
                }
                System.out.println();
            }*/


            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + "\t\t" +
                        resultSet.getString("firstName") + "\t\t" +
                        resultSet.getString("lastName") + "\t" +
                        resultSet.getString("email") + "\t" +
                        resultSet.getString("phoneNo"));
            }
        } catch (Exception ex) {
            System.out.println("Failed");
            System.out.println(ex.getMessage());
            System.exit(-1);
        }
    }
}
