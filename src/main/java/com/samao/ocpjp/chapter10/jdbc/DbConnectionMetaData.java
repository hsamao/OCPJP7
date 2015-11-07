package com.samao.ocpjp.chapter10.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

/**
 * Created by hsamao on 11/7/15.
 */
public class DbConnectionMetaData {

    public static void main(String[] args) {
        try (Connection connection = DbConnectorUtility.connectToDB()) {
            DatabaseMetaData databaseMetaData = connection.getMetaData();

            System.out.println("Displaying some of the database metadata from the connection object");
            System.out.println("Database is : " + databaseMetaData.getDatabaseProductName() + " "
                    + databaseMetaData.getDatabaseProductVersion());

            System.out.println("Driver is : " + databaseMetaData.getDriverName() + " "
            + databaseMetaData.getDriverVersion());

            System.out.println("The URL for this connection is : " + databaseMetaData.getURL());
            System.out.println("User name is : " + databaseMetaData.getUserName());
            System.out.println("Maximun number of rows you can insert is : " + databaseMetaData.getMaxRowSize());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.exit(-1);
        }
    }
}
