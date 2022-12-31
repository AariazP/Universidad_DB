package co.edu.uniquindio.universidad.controllers;
import co.edu.uniquindio.universidad.application.Application;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Controller {

     Application application;

     public abstract void inicializar();

}
