package gestion;

import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	public ArrayList<Zona> zonas = new ArrayList<>();
	
	public Zoologico(String nombre, String ubicacion) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public Zoologico() {
		super();
	}
	
	public int cantidadTotalAnimales() {
		int nAnimals = 0;
		for(Zona z:zonas) {
			nAnimals = nAnimals + z.cantidadAnimales();
		}

		return nAnimals;
	}
	
	public void agregarZonas(Zona zona) {//revisar
		zonas.add(zona);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public ArrayList<Zona> getZona() {
		return zonas;
	}

	public void setZona(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
	
	

}
