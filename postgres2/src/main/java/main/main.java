package main;

import java.sql.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        add add=new add();
        adduser adduser=new adduser();
         dbworker dbworker=new dbworker();
        String query = "INSERT INTO students.student(surname, name, fathernam, age, \"Group\")  VALUES(?,?,?,?,?)";
        String query1= "SELECT * from students.student";
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите вашу Фамилию:");
        adduser.setSurname(scanner.nextLine());
        System.out.println("Введите ваше Имя:");
        adduser.setName(scanner.nextLine());
        System.out.println("Введите ваше Отчество:");
        adduser.setFathername(scanner.nextLine());
        System.out.println("Введите вашу Группу");
        adduser.setGroup(scanner.nextLine());
        System.out.println("Введите ваш Возраст:");
        adduser.setAge(scanner.nextInt());
        System.out.println("Спасибо");
        try {
            PreparedStatement preparedStatement=null;
            preparedStatement=dbworker.getConnection().prepareStatement(query);
            preparedStatement.setString(1, adduser.getSurname());
            preparedStatement.setString(2,adduser.getName());
            preparedStatement.setString(3,adduser.getFathername());
            preparedStatement.setInt(4,adduser.getAge());
            preparedStatement.setString(5,adduser.getGroup());
            preparedStatement.execute();

        }catch (SQLException e)
        {
            e.printStackTrace();
        }


        {
        try {
            Statement statement = dbworker.getConnection().createStatement();

            final ResultSet resultSet= statement.executeQuery(query1);
            while (resultSet.next()){
                students students=new students();
                students.setId(resultSet.getInt("id"));
                students.setSurname(resultSet.getString("surname"));
                students.setName(resultSet.getString("name"));
                students.setFathername(resultSet.getString("fathernam"));
                students.setAge(resultSet.getInt("age"));
                students.setGroup(resultSet.getString("Group"));
                System.out.println(students);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

}
