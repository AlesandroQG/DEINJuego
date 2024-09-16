module com.alesandro.juego {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.alesandro.juego to javafx.fxml;
    exports com.alesandro.juego;
}