package sample;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import java.sql.DriverManager;


public class Controller {

    private static final String Url="jdbc:mysql://localhost:3306/test";
    private static final String user="root";
    private static final String password="password";

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
});
delete_button.setOnAction(event -> {
    firstname_field.clear();
    lastname_field.clear();
    fathername_field.clear();
    phunenumber_field.clear();
});

        Connection connection;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/joob","root","password");

        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }


    }
}

