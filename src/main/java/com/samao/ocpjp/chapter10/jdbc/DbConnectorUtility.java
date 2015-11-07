package com.samao.ocpjp.chapter10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by hsamao on 11/6/15.
 */
public class DbConnectorUtility {

    public static Connection connectToDB () throws Exception {

        String url = "jdbc:mysql://localhost:3307/";
        String database = "addressBook";
        String userName = "root";
        String password = "";
        return (DriverManager.getConnection(url+database, userName, password));
    }
}
