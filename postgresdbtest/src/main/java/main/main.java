package main;

import java.sql.*;
import java.util.Scanner;

public class main {


    public static void main(String[] args){
        add add=new add();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите вашу логин");
        add.setUsername(scanner.nextLine());
        System.out.println("Введите ваше пароль:");
        add.setPassword(scanner.nextLine());


        dbWorker dbWorker= new dbWorker();

        String query="select * from users";
        String query1="INSERT INTO users(username, password) VALUES(?,?) ";
        try {
            PreparedStatement preparedStatement=null;
         preparedStatement=dbWorker.getConnection().prepareStatement(query1);
         preparedStatement.setString(1, add.getUsername());
         preparedStatement.setString(2,add.getPassword());
         preparedStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }



        try {
            Statement statement=dbWorker.getConnection().createStatement();
            final ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                user user=new user();
             user.setId(resultSet.getInt(1));
             user.setUsername(resultSet.getString(2));
             user.setPassword(resultSet.getString(3));
                System.out.println(user);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
