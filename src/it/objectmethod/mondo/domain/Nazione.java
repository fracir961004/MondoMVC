package it.objectmethod.mondo.domain;

public class Nazione {
	private int id;
	private String code;
	private String nome;
	private int popolazione;

	public Nazione() {

	}

	public Nazione(int id, String code, String nome, int popolazione) {
		this.id = id;
		this.code = code;
		this.nome = nome;
		this.popolazione = popolazione;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPopolazione() {
		return popolazione;
	}

	public void setPopolazione(int popolazione) {
		this.popolazione = popolazione;
	}

	public String toString() {
		return id + " " + code + " " + nome + " " + popolazione + " ";
	}
}
