package sample;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField firstname_field;

    @FXML
    private Button select_image_button;

    @FXML
    private Button delete_button;

    @FXML
    private Button add_button;

    @FXML
    private Button save_button;

    @FXML
    private TextField lastname_field;

    @FXML
    private TextField fathername_field;

    @FXML
    private TextField phunenumber_field;

    @FXML
    private TextField find_field;

    @FXML
    private DatePicker data_field;

    @FXML
    private Button find_button;

    @FXML
    private RadioButton male_radio;

    @FXML
    private RadioButton famele_radio;

    @FXML
    void initialize() {
      add_button.setOnAction(event -> {
          firstname_field.setEditable(true);
          lastname_field.setEditable(true);
          fathername_field.setEditable(true);
          phunenumber_field.setEditable(true);
          data_field.setEditable(true);
          data_field.setVisible(true);
          firstname_field.setVisible(true);
          lastname_field.setVisible(true);
          fathername_field.setVisible(true);
          phunenumber_field.setVisible(true);
      });
    delete_button.setOnAction(event ->  {
        firstname_field.clear();
        lastname_field.clear();
        fathername_field.clear();
        phunenumber_field.clear();

        find_field.clear();
    });

    save_button.setOnAction(event -> {user user=new user();
        user.setFirstname(firstname_field.getText());
        user.setLastname(lastname_field.getText());
        user.setFathername(fathername_field.getText());
        user.setDatabirthday(data_field.getEditor().getText());
        user.setPhonenumber(phunenumber_field.getText());
        if(male_radio.isSelected()){
            user.setGender("Мужской");
        }else
            user.setGender("Женский");

        String driver   = "com.mysql.jdbc.Driver";
        String url      = "jdbc:mysql://localhost:3306/";
        String dbName   = "test1";
        String userName = "root";
        String password = "password";
        try {
            
            Class.forName(driver).newInstance();
            Connection conn = DriverManager.getConnection(url + dbName, userName, password);
            try {String query="INSERT INTO users(firstname, lastname, fathername, phone, gender) VALUES (?,?,?,?,?)";
                PreparedStatement preparedStatement=null;
                preparedStatement=conn.prepareStatement(query);
                preparedStatement.setString(1, user.getFirstname());
                preparedStatement.setString(2,user.getLastname());
                preparedStatement.setString(3,user.getFathername());
                preparedStatement.setString(4,user.getPhonenumber());
                preparedStatement.setString(5,user.getGender());

                preparedStatement.execute();

            }catch (SQLException e)
            {
                e.printStackTrace();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        Alert alert =new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Удачно!");
        alert.setHeaderText("Регистрация прошла удачно!");
        alert.setContentText("Поздравляем!");
        alert.showAndWait();


        firstname_field.clear();
        lastname_field.clear();
        fathername_field.clear();
        phunenumber_field.clear();
        find_field.clear();


    });

    find_button.setOnAction(event -> {




    });



    }
}

