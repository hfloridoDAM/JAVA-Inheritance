package model;

public class CartaRara extends Carta {
	
	private int usos;

	public CartaRara(int usos) {
		super(2, 2, 2);
		this.usos = usos;
	}

	@Override
	public String toString() {
		return "CartaRara [" + super.getDano() + " " + super.getPoder() + " " + super.getSalud() + " " + this.usos + "]";
	}	

}
