package model;

public class Funcionario extends Pessoa {
     
    private double salario;

    public Funcionario(){
    super();
    }

    public Funcionario(String nome, int idade, double salario){
        super(nome, idade);
        this.salario = salario;
    }

    public void exibirSalario(){
        System.out.println("Salario: " + getSalario());
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        exibirSalario();
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }


    
}
