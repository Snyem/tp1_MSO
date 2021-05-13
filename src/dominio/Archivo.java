package dominio;

public class Archivo {
	private String nombre;
	private int tamanio;
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int tamanio() {
		return this.tamanio;
	}
	
	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}
}
