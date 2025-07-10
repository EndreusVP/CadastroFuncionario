package controller;

import java.util.ArrayList;
import java.util.List;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.io.BufferedReader;
import java.io.FileReader;

import model.Funcionario;
import model.Pessoa;

public class GerenciadorPessoa {

    private List<Pessoa> lista;

    public GerenciadorPessoa() {
        lista = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa p) {
        lista.add(p);
    }

    public void removerPessoa(Pessoa p) {
        lista.remove(p);
    }

    public void listarPessoas() {
        for (Pessoa p : lista) {
            p.exibirInfo();
            System.out.println("--------");
        }
    }

    public void salvarEmArquivo(String nomeArquivo){
     try {

        PrintWriter writer = new PrintWriter(new FileWriter(nomeArquivo));
        
        for(Pessoa p : lista) {

            if (p instanceof Funcionario) {

                Funcionario f = (Funcionario) p;
                writer.println("F;" + f.getNome() + ";"  + f.getIdade() + ";" + f.getSalario());
                
            } else {
                writer.println("P;" + p.getNome() + ";" + p.getIdade());
            }
            
        }

        writer.close();
        System.out.println("Dados salvos com sucesso");
        
     } catch (IOException e) {
        // TODO: handle exception

        System.out.println("Erro ao salvar os dados!!" + e.getMessage());
     }
    }public void carregarDoArquivo(String nomeArquivo) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo));
            String linha;

            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");

                if (dados[0].equals("F")) {

                    String nome = dados[1];
                    int idade = Integer.parseInt(dados[2]);
                    double salario = Double.parseDouble(dados[3]);
                    lista.add(new Funcionario(nome, idade, salario));
                    
                } else if(dados[0].equals("P")) {

                    String nome = dados[1];
                    int idade = Integer.parseInt(dados[2]);
                    lista.add(new Pessoa(nome, idade));
                    
                }
            }

            reader.close();

            System.out.println("Dados carregados com sucesso");

        } catch (IOException e) {
            // TODO: handle exception

            System.out.println("Erro ao carregar: " + e.getMessage());
        }

    }



}
