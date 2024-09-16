package beans;

/**
 * Clase principal del juego
 */
public class Juego {
    /**
     * El jugador del juego
     */
    private Jugador jugador;
    /**
     * El enemigo del juego
     */
    private Enemigo enemigo;

    /**
     * Constructor que automáticamente crea el jugador y el enemigo del juego
     */
    public Juego() {
        this.jugador = new Jugador();
        this.enemigo = new Enemigo();
    }

    /**
     * Función de jugar
     */
    public void jugar() {
        int jugadorDado = dado();
        int enemigoDado = dado();
        if (jugadorDado > enemigoDado) {
            int resta = jugadorDado - enemigoDado;
            enemigo.setVida(enemigo.getVida() - resta);
        } else if (enemigoDado > jugadorDado) {
            int resta = enemigoDado - jugadorDado;
            jugador.setVida(jugador.getVida() - resta);
        } else {
            System.out.println("Empate");
        }
    }

    /**
     * Función del dado. Genera un número al azar entre el 1 y el 6.
     * @return valor del dado
     */
    private int dado() {
        return (int)(1+Math.random()*6);
    }

    /**
     * Obtiene el jugador del juego
     * @return el jugador
     */
    public Jugador getJugador() {
        return jugador;
    }

    /**
     * Obtiene el enemigo del juego
     * @return el enemigo
     */
    public Enemigo getEnemigo() {
        return enemigo;
    }
}
