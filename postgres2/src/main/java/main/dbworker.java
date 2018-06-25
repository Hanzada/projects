package main;

import java.sql.*;

public class dbworker {
private static final String url="jdbc:postgresql://localhost:5432/Kazatu";
private static final String user="root";
private static final String password="password";

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    Connection connection;
public dbworker(){
    try{
        connection=DriverManager.getConnection(url,user,password);
    }
    catch (SQLException e){
        e.printStackTrace();
    }
    }
}
