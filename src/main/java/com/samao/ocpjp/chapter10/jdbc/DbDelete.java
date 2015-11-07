package com.samao.ocpjp.chapter10.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by hsamao on 11/7/15.
 */
public class DbDelete {

    public static void main(String[] args) throws Exception {

        try (Connection connection = DbConnectorUtility.connectToDB();
//            System.out.println("Connected to database successfully");
             Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet resultSet = statement.executeQuery("SELECT * FROM contact WHERE firstName = \"Bob\";")) {
            if (resultSet.next()) {
                resultSet.deleteRow();
            }

            System.out.println("Row has been deleted successfully");
            resultSet.close();

            try (ResultSet resultSet1 = statement.executeQuery("SELECT * FROM contact;")) {
                System.out.println("AFTER DELETION");
                while (resultSet1.next()) {
                    System.out.println(resultSet.getInt("id") + "\t\t" +
                            resultSet1.getString("firstName") + "\t\t" +
                            resultSet1.getString("lastName") + "\t" +
                            resultSet1.getString("email") + "\t" +
                            resultSet1.getString("phoneNo"));
                }

            }
        } catch (SQLException E) {
            System.out.println(E.getMessage());
        }
    }
}
