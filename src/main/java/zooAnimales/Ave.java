package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	private static ArrayList<Ave>listado = new ArrayList<>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;

	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat,genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}

	public Ave() {
		super();
		listado.add(this);
	}
	
	public static int cantidadAves() {
		return listado.size();
	}
	
	@Override
	public String movimiento() {
		return "volar";
	}
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave miHalcon = new Ave(nombre, edad, "montañas", genero, "cafe glorioso");
		halcones++;
		return miHalcon;
	}
	public static Ave crearAguila(String nombre, int edad, String genero) {
		Ave miAguila = new Ave(nombre, edad, "montañas", genero, "blanco y marillo");
		aguilas++;
		return miAguila;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	
}
