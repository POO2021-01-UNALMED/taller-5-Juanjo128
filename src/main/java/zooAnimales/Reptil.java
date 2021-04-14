package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal{
	private static ArrayList<Reptil> listado = new ArrayList<>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;

	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}

	public Reptil() {
		super();
		listado.add(this);
	}

	public static int cantidadReptiles() {
		return listado.size();
	}
	
	@Override
	public String movimiento() {
		return "reptar";
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil miIguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		iguanas++;
		return miIguana;
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil miSerpiente = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
		serpientes++;
		return miSerpiente;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
	
}
