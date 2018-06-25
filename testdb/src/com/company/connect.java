package com.company;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connect {
    private static final String Url="jdbc:localhost:3306/test";
    private static final String user="root";
    private static final String password="password";

    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    private static String query="select * from users";

}
