package com.cse.tansik.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.Date;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class getconrction {

    private String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
    private String username = "hr";
    private String password = "hr";

    public void connect() {

        //        try (Connection myConn = DriverManager.getConnection(url, "hr", "hr");
        //             Statement myStmt = myConn.createStatement();
        //             ResultSet myRes = myStmt.executeQuery("select * from employees")) {
        //            while (myRes.next()) {
        //                System.out.println(myRes.getString(2) + "  " + myRes.getNString(3));
        //
        //            }
        //        } catch (Exception ex) {
        //            ex.printStackTrace();

        try (JdbcRowSet jdbcRs = RowSetProvider.newFactory().createJdbcRowSet()) {
            jdbcRs.setUrl(url);
            jdbcRs.setUsername(username);
            jdbcRs.setPassword(password);
            jdbcRs.setCommand("SELECT * FROM Employee");
            jdbcRs.execute();
            // Now just treat JDBC Row Set like a ResultSet object 18
            while (jdbcRs.next()) {
                int empID = jdbcRs.getInt("ID");
                String first = jdbcRs.getString("FirstName");
                String last = jdbcRs.getString("LastName");
                Date birthDate = jdbcRs.getDate("BirthDate");
                float salary = jdbcRs.getFloat("Salary");
            }
        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }
}

