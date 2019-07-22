package it.objectmethod.mondo.domain;

public class Popolazione {
	
	private int numero;
	private String language;
	
	public Popolazione() {
		
	}
	
	public Popolazione(int numero, String language) {
		this.numero=numero;
		this.language=language;
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	public String toString() {
		
		return numero+" "+language+" ";
	}
	
	

}
