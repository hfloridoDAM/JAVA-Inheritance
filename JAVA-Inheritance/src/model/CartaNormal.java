package model;

public class CartaNormal extends Carta {

	public CartaNormal() {
		super(1, 1, 1);
	}

	@Override
	public String toString() {
		return "CartaNormal [" + super.getDano() + " " + super.getPoder() + " " + super.getSalud() + "]";
	}
	
}	
