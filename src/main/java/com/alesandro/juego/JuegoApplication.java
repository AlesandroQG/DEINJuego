package com.alesandro.juego;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

import beans.*;

public class JuegoApplication extends Application {
    protected Juego juego;

    @Override
    public void start(Stage stage) throws IOException {
        // Iniciar juego
         juego = new Juego();

        // Vida
        Label vidaJugador = new Label(juego.getJugador().getVida() + "");
        vidaJugador.setStyle("-fx-color: green;");
        Label vidaEnemigo = new Label(juego.getEnemigo().getVida() + "");
        BorderPane borderPane = new BorderPane();
        borderPane.setLeft(vidaJugador);
        borderPane.setRight(vidaEnemigo);

        // Resultados
        Label txt = new Label();

        // Botón atacar
        Button btnAtacar = new Button("ATACAR");

        btnAtacar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });

        // Contenedor principal
        Pane root = new Pane();
        root.getChildren().add(borderPane);

        // Escena
        Scene scene = new Scene(root, 300, 300);
        String url = getClass().getResource("/css/style.css").toString();
        scene.getStylesheets().add(url);
        stage.setTitle("Juego");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch();
    }
}