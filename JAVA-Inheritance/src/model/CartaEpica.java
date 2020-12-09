package model;

public class CartaEpica extends Carta {

	private String name;
	
	public CartaEpica(String name) {
		super(3, 3, 3);
		this.name = "Martillo Rúnico";
	}

	@Override
	public String toString() {
		return "CartaEpica [" + super.getDano() + " " + super.getPoder() + " " + super.getSalud() + " " + this.name + "]";
	}
	
}