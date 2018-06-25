package sample;
import java.sql.*;

public class databasehandler extends configs{
    Connection connection;
    public Connection getConnection() throws ClassNotFoundException,SQLException{
        String connectionString="jdbc:mysql://"+dbHost+":"+
                dbPort+"/"+dbName;
        String driver   = "com.mysql.jdbc.Driver";

        connection=DriverManager.getConnection(connectionString,dbUser,dbPassword);
        return connection;
    }

    //write
    public void signupuser(user user){
        String insert=" INSERT INTO "+Const.USER_TABLE +"(name, lastname, username, password, phone, gender) VALUES(?,?,?,?,?,?)";

        try {
            PreparedStatement preparedStatement=getConnection().prepareStatement(insert);
            preparedStatement.setString(1,user.getName());
            preparedStatement.setString(2,user.getLastname());
            preparedStatement.setString(3,user.getUsername());
            preparedStatement.setString(4,user.getPassword());
            preparedStatement.setString(5,user.getPhone());
            preparedStatement.setString(6,user.getGender());
            preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ResultSet getuser(user user){
        ResultSet resultSet=null;
        String query ="SELECT * FROM "+ Const.USER_TABLE +" WHERE "+Const.USERS_USERNAME+" =? AND "+Const.USERS_PASSWORD+" =?";

        try {
            PreparedStatement preparedStatement=getConnection().prepareStatement(query);
            preparedStatement.setString(1,user.getUsername());
            preparedStatement.setString(2,user.getPassword());
            resultSet=preparedStatement.executeQuery();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        };
        return resultSet;
    }

}
