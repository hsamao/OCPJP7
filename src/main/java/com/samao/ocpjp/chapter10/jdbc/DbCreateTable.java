package com.samao.ocpjp.chapter10.jdbc;

import java.sql.Connection;
import java.sql.Statement;

/**
 * Created by hsamao on 11/7/15.
 */
public class DbCreateTable {
    public static void main (String [] args){
        try (Connection connection = DbConnectorUtility.connectToDB()){
            Statement statement = connection.createStatement();
            int result = statement.executeUpdate("CREATE TABLE FAMILY_GROUP(ID INT NOT NULL AUTO_INCREMENT," +
                    "NICKNAME VARCHAR (30) NOT NULL , PRIMARY KEY (ID));");
            System.out.println("TABLE CREATED SUCCESSFULLY");
            System.out.println(result);
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Exiting ....");
            System.exit(-1);
        }
    }
}
