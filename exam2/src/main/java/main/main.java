package main;


import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class main {
    private static final String Url="jdbc:mysql://localhost:3306/test";
    private static final String user="root";
    private static final String password="password";
    public static void main(String[] args){


        Connection connection;
        try {
            Driver driver=new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
            connection=DriverManager.getConnection(Url,user,password);
            if (!connection.isClosed())
            {
                System.out.println("Соеденение успешно завершена!");
            }
            connection.close();
            if (connection.isClosed())
            {
                System.out.println("Соеденение успешно закрыто!");
            }
        } catch (SQLException e) {
            System.out.print("Соединие не удалось!");
        }


    }
}