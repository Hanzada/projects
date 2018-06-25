package main;
import java.sql.*;
import java.sql.SQLException;
public class dbWorker {
private static final String url="jdbs:postgresql://localhost:5432/test1";

private static final String user="root";
private static final String password="password";
private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public dbWorker(){
    try {
        connection=DriverManager.getConnection(url,user,password);
    }catch (SQLException e){
        e.printStackTrace();

    }


}
}
