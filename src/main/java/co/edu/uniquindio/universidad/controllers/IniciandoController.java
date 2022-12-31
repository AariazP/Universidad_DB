package co.edu.uniquindio.universidad.controllers;

import co.edu.uniquindio.universidad.utils.Utils;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
public class IniciandoController extends Controller {


    @FXML
    private ProgressBar progressBar;



    public void inicializar() {
        System.out.println("entro" );
        /*progressBar.setProgress(0.0);
        //ciclo que va a ir aumentando el progreso de la barra hasta llegar a 100%
        //creo un nuevo hilo al vuelo y lo uno al hilo principal
        *//*for (int i = 0; i <= 10; i++) {
            progressBar.setProgress(progressBar.getProgress()+ 0.1);
        }*//*
        progressBar.setProgress(1.0);*/
        //una vez que llega a 100% se carga la siguiente ventana
        try {
            application.loadStage(Utils.menuPrincipalView);
            System.out.println("cambio la sc" );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
