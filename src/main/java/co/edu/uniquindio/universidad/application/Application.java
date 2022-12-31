package co.edu.uniquindio.universidad.application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {

    public static boolean isTest = false;

    public static void main(String[] args) {
        launch();
        isTest = true;
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Login.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.show();
    }

    public void login() {
    }

    public void register() {

    }
}