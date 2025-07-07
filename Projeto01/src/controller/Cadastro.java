package controller;

import model.Pessoa;

public class Cadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		p2.nome = "lucas";
		p2.idade = 45;
		
		p2.exibirInfo();
		
		p1.nome = "mariai";
		p1.idade = 21;
		
		p1.exibirInfo();

	}

}
