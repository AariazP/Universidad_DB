package org.example;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    public static boolean isTest = false;

    public static void main(String[] args) {
        launch(args);
        isTest = true;
    }

    @Override
    public void start(Stage stage) throws Exception {

        stage.show();
    }
}