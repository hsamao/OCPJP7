package com.samao.ocpjp.chapter10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by hsamao on 11/6/15.
 */
public class DBConnector {

    public static void main(String [] args){

        String url = "jdbc:mysql://localhost:3307/";
        String database = "addressBook";
        String userName = "root";
        String password = "";

        try (Connection connection = DriverManager.getConnection(url + database, userName, password)){

            System.out.println("connected successfully to mysql database");

        } catch (Exception ex) {
            System.out.println("Connection Failed");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
