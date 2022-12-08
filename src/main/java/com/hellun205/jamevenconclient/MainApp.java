package com.hellun205.jamevenconclient;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class MainApp extends Application {

  public static void main(String[] args) {
    launch();
  }

  @Override
  public void start(Stage primaryStage) throws Exception{
//    URL fxmlLocation = getClass().getResource("scene.fxml");
    FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("scene.fxml"));
    fxmlLoader = new FXMLLoader(MainApp.class.getResource("scene.fxml"));

    Scene scene = new Scene(fxmlLoader.load(), 320, 240);
    scene.getStylesheets().add(MainApp.class.getResource("styles.css").toExternalForm());

    primaryStage.setTitle("JavaFX and Gradle");
    primaryStage.setScene(scene);
    primaryStage.show();

  }
}