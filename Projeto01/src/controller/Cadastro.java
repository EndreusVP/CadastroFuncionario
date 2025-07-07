package controller;

import model.Pessoa;

public class Cadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p1 = new Pessoa("Maria", 21);
		Pessoa p2 = new Pessoa("Lucas",  45);

		p1.exibirInfo();

		System.out.println("------------");

		p2.exibirInfo();
	}

}
