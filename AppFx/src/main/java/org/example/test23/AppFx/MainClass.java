package org.example.test23.AppFx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class MainClass extends Application {
    //public static Stage mainFrame = null;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainFrame.fxml"));
        Parent root = (Parent) loader.load();
        MainFrame mainFrame = (MainFrame) loader.getController();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        //Platform.runLater(new Runnable() {
        //    @Override
        //    public void run() {
        try {
            mainFrame.label1.setText("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //String xx = mainFrame.label1.getText();
                //mainFrame.label1.setText("AA");
        //    }
        //});
    }
}
