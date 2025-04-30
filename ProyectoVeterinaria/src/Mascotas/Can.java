package Mascotas;

public class Can {
	private String nombre, nombreMas, animal;
	private int años;
	public Can(String nombre, String nombreMas, String animal, int años) {
		this.nombre = nombre;
		this.nombreMas = nombreMas;
		this.animal = animal;
		this.años = años;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAños() {
		return años;
	}
	public void setAños(int años) {
		this.años = años;
	}
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public String getNombreMas() {
		return nombreMas;
	}
	public void setNombreMas(String nombreMas) {
		this.nombreMas = nombreMas;
	}

}
