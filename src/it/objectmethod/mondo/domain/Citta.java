package it.objectmethod.mondo.domain;

public class Citta {
	
	private int id;
	private String Name;
	private String countryCode;
	private String district;
	private int population;
	
	public Citta() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	
	public String toString() {
		return id+" "+Name+" "+countryCode+" "+district+" "+population+" ";
	}

}
