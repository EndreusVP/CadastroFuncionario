package controller;

import model.Funcionario;
import model.Pessoa;

public class Cadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GerenciadorPessoa grupo = new GerenciadorPessoa();

		Pessoa p1 = new Pessoa("Maria", 21);
		Funcionario f1 = new Funcionario("Marcio", 23, 3800.00);

		grupo.adicionarPessoa(p1);
		grupo.adicionarPessoa(f1);

		grupo.listarPessoas();

	}

}
