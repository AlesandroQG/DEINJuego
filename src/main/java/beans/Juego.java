package beans;

public class Juego {
    private Jugador jugador;
    private Enemigo enemigo;

    public Juego() {
        this.jugador = new Jugador();
        this.enemigo = new Enemigo();
    }

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

    private int dado() {
        return (int)(1+Math.random()*6);
    }

    public Jugador getJugador() {
        return jugador;
    }

    public Enemigo getEnemigo() {
        return enemigo;
    }
}
