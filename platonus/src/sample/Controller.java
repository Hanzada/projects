package sample;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.animations.Shake;

import javax.xml.soap.Node;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    private Button autSigninButton;

    @FXML
    private Button loginsignupButton;

    @FXML
    void initialize() {
        loginsignupButton.setOnAction(event -> {
            loginsignupButton.getScene().getWindow().hide();
            FXMLLoader loader=new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/regist.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root=loader.getRoot();
            Stage stage=new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();


        });



        autSigninButton.setOnAction(event ->
        {String loginText=login_field.getText().trim();
        String passwordText=password_field.getText().trim();
        if(!loginText.equals("")&& !loginText.equals("")){
            try {
                loginUser(loginText,passwordText);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }else
            System.out.println("ERROR!");

        });
            }

    private void loginUser(String loginText, String passwordText) throws SQLException {
    databasehandler databasehandler=new databasehandler();
    user user=new user();
    user.setUsername(loginText);
    user.setPassword(passwordText);
    ResultSet resultSet=databasehandler.getuser(user);
    int counter=0;
    while (resultSet.next()){
        counter++;
    }
    if(counter>=1){
    opennewScene("/sample/app.fxml");


    }

    else {
        Shake userloginAnim=new Shake((Node) login_field);
        Shake userpasswordAnim=new Shake((Node) password_field);
        userloginAnim.playanim();
        userpasswordAnim.playanim();
    }


    }

    public void opennewScene(String window){

        loginsignupButton.getScene().getWindow().hide();
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource(window));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root=loader.getRoot();
        Stage stage=new Stage();
        stage.setScene(new Scene(root));
        stage.showAndWait();

    }
}

