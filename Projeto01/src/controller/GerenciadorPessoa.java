package controller;

import java.util.ArrayList;
import java.util.List;

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

    public void listarPesoas() {
        for(Pessoa p : lista) {
            p.exibirInfo();
            System.out.println("--------");
        }
    }

}
