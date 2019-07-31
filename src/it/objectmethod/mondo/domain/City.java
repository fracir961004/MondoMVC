package it.objectmethod.mondo.domain;

public class City {

	private int id;
	private String name;
	private String code;
	private String district;
	private int population;

	public City() {

	}

	public City(int id, String name, String code, String district, int population) {
		this.id = id;
		this.name = name;
		this.code = code;
		this.district = district;
		this.population = population;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryCode() {
		return code;
	}

	public void setCountryCode(String countryCode) {
		code = countryCode;
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
		return id + " " + name + " " + code + " " + district + " " + population + " ";
	}
}
