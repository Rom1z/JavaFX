package com.example.demo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main6 extends Application {
    public static void main(String[] args){
        Application.launch(args);
    }
    @Override
    /*public void start(Stage primaryStage){
        HBox hBox = new HBox();
        hBox.getChildren().addAll(new Button("one"),  new Button("two"));
        hBox.setSpacing(5);
        hBox.setPadding(new Insets(5));

        Group root = new Group();
        root.getChildren().addAll(hBox);
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();*/

    public void start(Stage primaryStage){
        NumberTextField numberTextField = new NumberTextField();

        Group root = new Group();
        root.getChildren().addAll(numberTextField);
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();
    }
}