package sample;

import java.awt.*;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Controller {
    private String ImagePath=null;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField id_text;

    @FXML
    private TextField name_text;

    @FXML
    private TextField price_text;

    @FXML
    private DatePicker add_date;

    @FXML
    private Label iamge_label;

    @FXML
    private Button choose_image_button;

    @FXML
    private Button insert_button;

    @FXML
    private Button delete_button;

    @FXML
    private Button update_button;

    @FXML
    private Button first_button;

    @FXML
    private Button prev_button;

    @FXML
    private Button next_button;

    @FXML
    private Button last_button;

    @FXML
    ImageIcon initialize(){
    choose_image_button.setOnAction(event -> {

    });

    public ImageIcon ResizeImage(String ImagePath,byte[] pic)
    {
        ImageIcon myImage=null;
    if(ImagePath !=null){
        myImage=new ImageIcon(ImagePath);
    }
    else{
        myImage=new ImageIcon(pic);
    }
            Image img=myImage.getImage();
    Image im2 = img.getScaledInstance(191,152,Image.SCALE_SMOOTH);
    ImageIcon image=new ImageIcon(im2);
    return image;
    }



choose_image_button.setOnAction(event -> {

    JFileChooser fileChooser=new JFileChooser();
    fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));

    FileNameExtensionFilter filter=new FileNameExtensionFilter("*.image","jpg","png");
    fileChooser.addChoosableFileFilter(filter);
    int res=fileChooser.showSaveDialog(null);
    if(res==JFileChooser.APPROVE_OPTION){
        File selectedFile=fileChooser.getSelectedFile();
        String path=selectedFile.getAbsolutePath();
        iamge_label.
    }

});
    update_button.setOnAction(event -> {
        JOptionPane.showMessageDialog(null,"Beibarys");
    });




    }


}
