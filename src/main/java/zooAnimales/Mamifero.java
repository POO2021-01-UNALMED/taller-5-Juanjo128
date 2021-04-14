package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal{
	private static ArrayList<Mamifero> listado = new ArrayList<>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;

	public Mamifero(String nombre, int edad, String habitad, String genero, boolean pelaje, int patas){
		super(nombre, edad, habitad, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}

	public Mamifero() {
		super();
		listado.add(this);
	}
	
	public static int cantidadMamiferos() {
		return listado.size();
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero miCaballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
		caballos++;
		return miCaballo;
	}
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero miLeon = new Mamifero(nombre, edad, "selva", genero, true, 4);
		leones++;
		return miLeon;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	
}
