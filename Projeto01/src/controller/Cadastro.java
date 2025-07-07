package controller;

import java.util.ArrayList;

import model.Funcionario;
import model.Pessoa;

public class Cadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Pessoa> lista = new ArrayList<>();

		Pessoa p1 = new Pessoa("Maria", 21);
		Funcionario f1 = new Funcionario("Eduardo", 32, 1567.90);
		Funcionario f2 = new Funcionario("lucas", 22, 37000.80);

		lista.add(p1);
		lista.add(f1);
		lista.add(f2);

		for (Pessoa p: lista) {
			p.exibirInfo();
			System.out.println("---------");
		}
	}

}
