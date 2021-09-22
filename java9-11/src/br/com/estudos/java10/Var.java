package br.com.estudos.java10;

import java.util.List;
import java.util.Scanner;

public class Var {

    // o var veio para ser utilizado na redução de repetições dentro de metodos

    public static void main(String[] args) {
        pode();
        naoPode(null);
    }

    // o var pode ser usado quando é claro o tipo da variavel
    // exemplos:
    // *variaveis locais com inicialização
    // *foreach
    // for comum

    private static void pode() {
        // o var nao e uma palavra reservada
        var var = new Var(); // nao recomendado
        var i = 52;
        var teste = "Testando";
        var scanner = new Scanner(teste);
        var teste2 = getNome(); // nao recomendado

        var list = List.of("hello", "world");
        for (var elemento : list) { // nao recomendado
        }

        for (var j = 0; j < 50; j++) {
        }

    }

    // o var não pode ser usado quando não deixa claro o tipo da variavel
    // exemplos:
    // *Null
    // *Lambda
    // *Argumento de metodo
    // *Construtores
    // *Retorno de metodo
    // *Catch

    private static void naoPode(String nome) {
        // var i = null;
        // var apoie;
        /*var*/ Runnable r = () -> System.out.println("Inializando thread");

        // public DeclaracaoComVar(var nome) {
        //	}
//		try {
//		} catch (var e) {
//		}
    }

    private static String getNome() {
        return "Testando";
    }

}