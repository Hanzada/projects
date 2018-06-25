package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class regist {

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    private Button autSignUpButton;

    @FXML
    private TextField sighUpname;

    @FXML
    private TextField sighUplastname;

    @FXML
    private TextField SignupNumber;

    @FXML
    private CheckBox signUpCheckboxMale;

    @FXML
    private CheckBox signUpCheckboxFaMale;

    @FXML
    void initialize() {signupNewuser();

    }

    private void signupNewuser() {databasehandler databasehandler=new databasehandler();

        String name=sighUpname.getText();
        String lastname=sighUplastname.getText();
        String username=login_field.getText();
        String password=password_field.getText();
        String phone=SignupNumber.getText();
        String gender="";
        if(signUpCheckboxMale.isSelected())
            gender="Мужской";
        else
            gender="Женский";
        user user=new user(name,lastname,username,password,phone,gender);

        autSignUpButton.setOnAction(event -> {
            databasehandler.signupuser(user);
        });
    }
}

