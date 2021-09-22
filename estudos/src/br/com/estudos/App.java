package br.com.estudos;

import br.com.estudos.enumerator.Cargo;
import br.com.estudos.model.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Funcionario matheus = new Funcionario("matheus", 200);
        matheus.setCargo(Cargo.VENDEDOR);

        Funcionario nelson = new Funcionario("nelson", 25000);
        nelson.setCargo(Cargo.GERENTE);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(matheus);
        funcionarios.add(nelson);

        for(Funcionario funcionario : funcionarios) {
            if (funcionario.getCargo().equals(Cargo.VENDEDOR)) {
                System.out.println(funcionario.getNome());
                System.out.println(funcionario.getSalario());
            }
        }
    }
}

