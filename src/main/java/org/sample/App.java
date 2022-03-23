package org.sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        URL fxmlURL = getClass().getClassLoader().getResource("internet.fxml");
        GridPane root = FXMLLoader.load(fxmlURL);

        Scene scene = new Scene(root);
        stage.getIcons().add(new Image("gd.png"));
        stage.setTitle("JavaFXMLApp by Darko Jelic");
        scene.getStylesheets().add("style.css");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}