package controller;

import model.Funcionario;
import model.Pessoa;

public class Cadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p1 = new Pessoa("Maria", 21);
		//Pessoa p2 = new Pessoa("Lucas",  45);
		Funcionario f1 = new Funcionario("Eduardo", 32, 1567.90);
		
		p1.exibirInfo();

		System.out.println("----------");

		f1.exibirInfo();


	}

}
