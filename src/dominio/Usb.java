package dominio;

import java.util.ArrayList;
import java.util.List;

public class Usb {
	//Atributos
	private List<Archivo> archivos; 
	
	//Constructor
	public Usb() {
		this.archivos = new ArrayList<Archivo>();
	}
	
	
	//Métodos
	public void copiar(Archivo archivo) {
		this.archivos.add(archivo);
		
	}
	
	public boolean tieneTxt() {
		boolean response = false;
		
		for(int i = 0; i < this.archivos.size(); i++) {
			Archivo eachArchivo = this.archivos.get(i);
			String nombre = eachArchivo.getNombre();
			
			String[] parts = nombre.split("\\.");
			String extension = parts[1];
			
			if(extension.equals("txt")) {
				response = true;
			}
		}
		
		if(response) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean tieneJpg() {
		boolean response = false;
		
		for(int i = 0; i < this.archivos.size(); i++) {
			Archivo eachArchivo = this.archivos.get(i);
			String nombre = eachArchivo.getNombre();
			
			String[] parts = nombre.split("\\.");
			String extension = parts[1];
			
			if(extension.equals("jpg")) {
				response = true;
			}
		}
		
		if(response) {
			return true;
		} else {
			return false;
		}
	}
	
	public int espacioOcupado() {
		int response = 0;
		
		for(int i = 0; i < this.archivos.size(); i++) {
			Archivo eachArchivo = this.archivos.get(i);
			int tamano = eachArchivo.tamanio();
			response += tamano;
		}
		
		return response;
	}
}
