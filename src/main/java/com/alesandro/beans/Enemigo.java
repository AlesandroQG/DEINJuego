package com.alesandro.beans;

/**
 * Clase del enemigo
 *
 * @author alesandroquirosgobbato
 */
public class Enemigo {
    /**
     * Vida del enemigo
     */
    private int vida;

    /**
     * Constructor del enemigo que automáticamente asigna la vida a 100
     */
    public Enemigo() {
        this.vida = 20;
    }

    /**
     * Obtiene el valor de la vida del enemigo
     *
     * @return valor de la vida
     */
    public int getVida() {
        return vida;
    }

    /**
     * Actualiza el valor de la vida del enemigo
     *
     * @param vida del jugador a actualizar
     */
    public void setVida(int vida) {
        this.vida = vida;
    }
}
