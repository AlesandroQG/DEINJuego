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
     * @return Lista de valores a devolver -> {jugadorDado, enemigoDado, resultado('g' si ganado juego, 'p' si perdido juego, 'e' si enemigo gana ronda, 'j' si jugador gana ronda, 'm' si empate)}
     */
    public String[] jugar() {
        int jugadorDado = dado();
        int enemigoDado = dado();
        String[] resultado=new String[3];
        resultado[0] = jugadorDado + "";
        resultado[1] = enemigoDado + "";
        if (jugadorDado > enemigoDado) {
            int resta = jugadorDado - enemigoDado;
            enemigo.setVida(enemigo.getVida() - resta);
            if (enemigo.getVida()<=0) {
                resultado[2] = "g";
            } else {
                resultado[2] = "j";
            }
        } else if (enemigoDado > jugadorDado) {
            int resta = enemigoDado - jugadorDado;
            jugador.setVida(jugador.getVida() - resta);
            if (jugador.getVida()<=0) {
                resultado[2] = "p";
            } else {
                resultado[2] = "e";
            }
        } else {
            resultado[2] = "m";
        }
        return resultado;
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
