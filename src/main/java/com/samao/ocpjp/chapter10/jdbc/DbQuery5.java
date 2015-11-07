package com.samao.ocpjp.chapter10.jdbc;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

/**
 * Created by hsamao on 11/7/15.
 */
public class DbQuery5 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3307/addressBook";
        String userName = "root";
        String password = "";
        try {
            RowSetFactory rowSetFactory = RowSetProvider.newFactory();

            JdbcRowSet jdbcRowSet = rowSetFactory.createJdbcRowSet();
            jdbcRowSet.setUrl(url);
            jdbcRowSet.setUsername(userName);
            jdbcRowSet.setPassword(password);
            jdbcRowSet.setCommand("SELECT * FROM contact");
            jdbcRowSet.execute();
            System.out.println("id \t fName \t lName \t email \t tphoneNo");

            while (jdbcRowSet.next()) {
                System.out.println(jdbcRowSet.getInt("id") + "\t"
                        + jdbcRowSet.getString("firstName") + "\t"
                        + jdbcRowSet.getString("lastName") + "\t"
                        + jdbcRowSet.getString("email") + "\t"
                        + jdbcRowSet.getString("phoneNo"));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
