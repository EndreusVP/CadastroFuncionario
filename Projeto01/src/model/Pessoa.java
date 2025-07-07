package model;

public class Pessoa {
	
	private String nome;
	private int idade;

	public Pessoa(){
		super();
	};

	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public void exibirInfo() {
	System.out.println("Nome :" + nome);
	System.out.println("Idade :" + idade);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome(){
		return nome;
	}

	public int getIdad(){
		return idade;
	}

}
