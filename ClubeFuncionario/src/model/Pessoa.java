package model;

public abstract class Pessoa {

	private String nome;
	private String morada;
	private int idade;
	private int id;

	public Pessoa(int id, String nome, String morada, int idade) {
		super();
		setId(id);
		setNome(nome);
		setMorada(morada);
		setIdade(idade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
