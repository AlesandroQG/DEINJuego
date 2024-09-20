package com.alesandro.juego;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * <p>HelloController class.</p>
 *
 * @author alesandroquirosgobbato
 */
public class HelloController {
    @FXML
    private Label welcomeText;

    /**
     * <p>onHelloButtonClick.</p>
     */
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
