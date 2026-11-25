package comecocos;

public class Partida {
	private int puntuacion;
	private int vidas;
	private Comecocos jugador;
	private Fantasma fantasma;
	private Tablero tablero;
	
	public Partida() {
		this.puntuacion = 0;
		this.vidas = 3;
		this.jugador = new Comecocos ();
		this.fantasma = new Fantasma ();
		this.tablero = new Tablero ();
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	public Comecocos getJugador() {
		return jugador;
	}

	public void setJugador(Comecocos jugador) {
		this.jugador = jugador;
	}

	public Fantasma getFantasma() {
		return fantasma;
	}

	public void setFantasma(Fantasma fantasma) {
		this.fantasma = fantasma;
	}

	public Tablero getTablero() {
		return tablero;
	}

	public void setTablero(Tablero tablero) {
		this.tablero = tablero;
	}
	
	
	

	
	
	
}
