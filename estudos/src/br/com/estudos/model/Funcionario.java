package br.com.estudos.model;

import br.com.estudos.enumerator.Cargo;

public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;
    private Cargo cargo;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario(String nome, double salario, String cpf) {
        this.nome = nome;
        this.salario = salario;
        this.cpf = cpf;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario * cargo.getBonus();
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
