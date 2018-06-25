package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String driver   = "com.mysql.jdbc.Driver";
        String url      = "jdbc:mysql://localhost:3306/";
        String dbName   = "joob";
        String userName = "root";
        String password = "password";
        try {
            Class.forName(driver).newInstance();
            Connection conn = DriverManager.getConnection(url + dbName, userName, password);
            if (conn != null)
                System.out.println ("Приложение подключилось к БД !");
            else
                System.out.println ("Приложение НЕ подключилось к БД ?");

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
    }
}
}
