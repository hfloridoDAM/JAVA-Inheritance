package model;

public class Carta {
	private int poder;
	private int dano;
	private int salud;
	
	public Carta(int poder, int dano, int salud) {
		this.poder = poder;
		this.dano = dano;
		this.salud = salud;
	}

	public int getPoder() {
		return poder;
	}

	public int getDano() {
		return dano;
	}

	public int getSalud() {
		return salud;
	}
	
}
