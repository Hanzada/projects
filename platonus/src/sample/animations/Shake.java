package sample.animations;

import javafx.animation.TranslateTransition;
import javafx.util.Duration;

import javax.xml.soap.Node;

public class Shake {
    private TranslateTransition tt;
    public  Shake(Node node){
        tt=new TranslateTransition(Duration.millis(70), (javafx.scene.Node) node);
        tt.setFromX(0f);
        tt.setByX(10f);
        tt.setCycleCount(3);
        tt.setAutoReverse(true);


    }
    public void playanim(){
        tt.playFromStart();
    }
}
