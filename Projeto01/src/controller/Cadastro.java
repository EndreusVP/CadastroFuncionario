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

			while (selecao != 6) {

				System.out.println(1 +  " Adcionar Pessoa"); 
				System.out.println(2 +  " Adicionar Funcionario"); 
				System.out.println(3 +  " Listar Todos"); 
				System.out.println(4 +  " Salvar Arquivo");
				System.out.println(5 + " Carregar  Arquivo");
				System.out.println(6 + " Sair");

				
				selecao = entrada.nextInt();
				entrada.nextLine();

				switch (selecao) {
					case 1:
						System.out.println("Nome:");
						String nomePessoa = entrada.nextLine();
						System.out.println("Idade: ");
						int idadePessoa = entrada.nextInt();

						grupo.adicionarPessoa(new Pessoa(nomePessoa, idadePessoa));

						break;
					
					case 2:

						System.out.println("Nome");
						String nomeFuncionario = entrada.nextLine();
						System.out.println("Idade");
						int idadeFuncionario = entrada.nextInt();
						System.out.println("Salario");
						double salario = entrada.nextDouble();
						entrada.nextLine();

						grupo.adicionarPessoa(new Funcionario (nomeFuncionario, idadeFuncionario, salario));

						break;

					case 3:

						grupo.listarPessoas();

						break;

					case 4:

						grupo.salvarEmArquivo("pessoa.txt");

						break;

					case 5: 

						grupo.carregarDoArquivo("pessoa.txt");

						break;

					case 6:

						System.out.println("saindo...");

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
