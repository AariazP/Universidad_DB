package co.edu.uniquindio.universidad.application;
import co.edu.uniquindio.universidad.controllers.Controller;
import co.edu.uniquindio.universidad.utils.Utils;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {

    public static boolean isTest = false;
    private Stage stage;

    public static void main(String[] args) {
        launch();
        isTest = true;
    }

    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Login.fxml"));
        Scene scene = new Scene(loader.load());
        Controller controller = loader.getController();
        controller.setApplication(this);
        stage.setScene(scene);
        stage.show();
    }

    public void login(String usuario, String password) {
        try {
            loadStage(Utils.menuPrincipalView);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void loadStage(String ruta) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(ruta));
        Scene scene = new Scene(loader.load());
        Controller controller = loader.getController();
        controller.setApplication(this);
        controller.inicializar();
        stage.hide();
        stage.setScene(scene);
        stage.show();
    }

    public void register() {
    }
}