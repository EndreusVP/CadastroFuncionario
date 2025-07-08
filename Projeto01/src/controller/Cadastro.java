package controller;

import java.util.Scanner;

import model.Funcionario;
import model.Pessoa;

public class Cadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*GerenciadorPessoa grupo = new GerenciadorPessoa();

		Pessoa p1 = new Pessoa("Maria", 21);
		Funcionario f1 = new Funcionario("Marcio", 23, 3800.00);

		grupo.adicionarPessoa(p1);
		grupo.adicionarPessoa(f1);

		grupo.listarPessoas();*/

		Scanner entrada = new Scanner(System.in);
		GerenciadorPessoa grupo = new GerenciadorPessoa();

		int selecao = 0;

			while (selecao != 4) {

				System.out.println(1 +  " Adcionar Pessoa"); 
				System.out.println(2 +  " Adicionar Funcionario"); 
				System.out.println(3 +  " Listar Todos"); 
				System.out.println(4 +  " Sair");
				
				selecao = entrada.nextInt();
				entrada.nextLine();

				switch (selecao) {
					case 1:
						System.out.println("Nome:");
						String nomePessoa = entrada.nextLine();
						System.out.println("Idade: ");
						int indadePessoa = entrada.nextInt();

						grupo.adicionarPessoa(new Pessoa(nomePessoa, indadePessoa));

						break;
					
					case 2:

						System.out.println("Nome");
						String nomeFuncionario = entrada.nextLine();
						System.out.println("Idade");
						int idadeFuncionario = entrada.nextInt();
						System.out.println("Salario");
						double salario = entrada.nextDouble();

						grupo.adicionarPessoa(new Funcionario (nomeFuncionario, idadeFuncionario, salario));

						break;

					case 3:

						grupo.listarPessoas();

						break;

					case 4:

						System.out.println("Saindo...");

						break;

					default:

						System.out.println("Escolha uma opção valida!");

						break;
			}
				
		}

		System.out.println("programa finalizado!!");

		entrada.close();

		
	}

}
