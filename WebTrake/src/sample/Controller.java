package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;


import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public ImageView youtubeid;
    public ImageView googleid;
    public ImageView facebookid;
    public WebView webView;
    public Button btn;
    String traki;



    @Override
    public void initialize(URL url, ResourceBundle rb) {

            WebEngine engine = webView.getEngine();
            engine.load(traki);
            System.out.println(traki);

    }

    public void fb(MouseEvent event){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.facebook.com/");
        System.out.println(traki);
    }
    public void gl(MouseEvent event){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.google.com/");
        System.out.println(traki);
    }
    public void yt(MouseEvent event){

        WebEngine engine = webView.getEngine();
        engine.load("https://www.youtube.com/");
        System.out.println(traki);
    }

}
