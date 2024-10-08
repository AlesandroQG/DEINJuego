package com.alesandro.beans;

/**
 * Clase del jugador
 *
 * @author alesandroquirosgobbato
 */
public class Jugador {
    /**
     * Vida del jugador
     */
    private int vida;

    /**
     * Constructor del jugador que automáticamente asigna la vida a 100
     */
    public Jugador() {
        this.vida = 20;
    }

    /**
     * Obtiene el valor de la vida del jugador
     *
     * @return valor de la vida
     */
    public int getVida() {
        return vida;
    }

    /**
     * Actualiza el valor de la vida del jugador
     *
     * @param vida del jugador a actualizar
     */
    public void setVida(int vida) {
        this.vida = vida;
    }
}
