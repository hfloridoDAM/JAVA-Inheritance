package manager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import model.CartaNormal;
import model.CartaRara;
import model.Carta;
import model.CartaEpica;

public class Manager {
	private ArrayList<Carta> cartas;
	private List<String> nombres;
	private Scanner scan;
	private Random rand;
	private boolean salir;
	
	public Manager () {
		this.cartas = new ArrayList<>();
		scan = new Scanner(System.in);
		rand = new Random();
		salir = false;
		this.nombres = Arrays.asList("Martillo maldito", "Guadaña peluda", "Obelisco eterno", "Grial sagrado");
	}
	
	public void menu() {
		do {
			System.out.println("0-Salir\n1-Abrir paquete\n2-Mostrar Cartas\n3-Eliminar Carta");
			switch (scan.nextInt()) {
				case 0:
					salir = true;
					break;
				case 1:
					addCartas();
					break;
				case 2:
					showCartas();
					break;
				case 3:
					removeCarta();
					break;
				default: 
					System.out.println("Opcion incorrecta");
			}
		} while (!salir);
	}

	private void showCartas() {
		for (int i = 0; i < this.cartas.size(); i++) {
			System.out.println(i + " " + this.cartas.get(i).toString());
		}
	}

	private void removeCarta() {
		System.out.print("Selecciona posición de la carta: ");
		int pos = scan.nextInt();
		if (pos >= 0 && pos < this.cartas.size()) {
			this.cartas.remove(pos);
			System.out.println("Carta eliminada");
		} else {
			System.out.println("Carta no encontrada");
		}
	}

	private void addCartas() {
		for (int i = 0; i < 10; i++) {
			switch(rand.nextInt(6)) {
				case 0:
				case 1:
				case 2:
					this.cartas.add(new CartaNormal());
					break;
				case 3:
				case 4:
					this.cartas.add(new CartaRara(rand.nextInt(5)+1));
					break;
				case 5:
					this.cartas.add(new CartaEpica(nombres.get(rand.nextInt(3))));
					break;
			}
		}
	}
	
}
