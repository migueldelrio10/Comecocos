package comecocos;

public class Tablero {
	private int dimension;
	private char [] [] mapa;
	
	public Tablero() {
		this.dimension = 11;
		this.mapa = new char [] [] {
			{'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
	        {'#', '.', '.', '.', '#', '.', '.', '.', '.', '.', '#'},
		    {'#', '.', '#', '.', '#', '.', '#', '#', '#', '#', '#'},
		    {'#', '.', '#', '.', '.', '.', '.', '.', '.', '.', '#'},
		    {'#', '.', '#', '#', '#', '.', '#', '#', '#', '.', '#'},
		    {'#', '.', '.', '.', '.', '.', '.', '#', '.', '.', '#'},
		    {'#', '#', '#', '#', '#', '.', '.', '#', '.', '#', '#'},
		    {'#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'},
		    {'#', '.', '#', '#', '#', '#', '#', '.', '#', '.', '#'},
		    {'#', '.', '.', '.', '.', '.', '.', '.', '#', '.', '#'},
		    {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}
		};
	}

	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	public char[][] getMapa() {
		return mapa;
	}

	public void setMapa(char[][] mapa) {
		this.mapa = mapa;
	}
	
	
	
	

}
