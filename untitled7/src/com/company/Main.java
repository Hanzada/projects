package com.company;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

    public static void main(String[] args) {
        String driver   = "com.postgresql.jdbc.Driver";
        String url      = "jdbc:postgresql://localhost:3306/";
        String dbName   = "postgres";
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
