package co.edu.uniquindio.universidad.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoginController extends Controller {



    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtUsuario;

    @FXML
    void login(ActionEvent event) {

        String usuario = txtUsuario.getText();
        String password = txtPassword.getText();


        application.login(usuario, password);
    }

    public void register() {
        application.register();
    }


    @Override
    public void inicializar() {

    }
}
