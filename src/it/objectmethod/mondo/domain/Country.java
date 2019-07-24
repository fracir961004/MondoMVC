package it.objectmethod.mondo.domain;

public class Country {

	private int id;
	private String code;
	private String name;
	private int population;
	private String nazione;
	private String Continent;

	public Country() {

	}

	public Country(int id, String code, String name, int popolazione, String nazione, String Continent) {

		this.id = id;
		this.code = code;
		this.name = name;
		this.population = popolazione;
		this.nazione = nazione;
		this.Continent = Continent;
	}

	public String getNazione() {
		return nazione;
	}

	public void setNazione(String nazione) {
		this.nazione = nazione;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopolazione() {
		return population;
	}

	public void setPopolazione(int popolazione) {
		this.population = popolazione;
	}

	public String getContinente() {
		return Continent;
	}

	public void setContinente(String Continent) {
		this.Continent = Continent;
	}

	public String toString() {
		return id + " " + code + " " + name + " " + population + nazione + " " + " " + Continent + " ";
	}

}
