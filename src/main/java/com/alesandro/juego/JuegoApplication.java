package com.alesandro.juego;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import beans.*;

/**
 * Clase principal donde se dibuja y ejecuta el programa
 */
public class JuegoApplication extends Application {
    private Juego juego;

    @Override
    public void start(Stage stage) {
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
        Label txt = new Label("");

        // Botón atacar
        Button btnAtacar = new Button("ATACAR");

        btnAtacar.setOnAction(actionEvent -> {
            String[] resultado = juego.jugar();
            vidaJugador.setText(juego.getJugador().getVida() + "");
            vidaEnemigo.setText(juego.getEnemigo().getVida() + "");
            String puntos = resultado[0] + " - " + resultado[1];
            String val = resultado[2];
            switch(val) {
                case "p":
                    btnAtacar.setDisable(true);
                    txt.setText("Has perdido!\n" + puntos);
                    break;
                case "g":
                    btnAtacar.setDisable(true);
                    txt.setText("Has ganado!\n" + puntos);
                    break;
                case "e":
                    txt.setText("Enemigo gana ronda!\n" + puntos);
                    break;
                case "j":
                    txt.setText("Jugador gana ronda!\n" + puntos);
                    break;
                default:
                    txt.setText("Empate!\n" + puntos);
            }
        });

        // Contenedor principal
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(borderPane, btnAtacar, txt);

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