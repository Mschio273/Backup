package br.com.estudos.java11;

import java.util.Arrays;
import java.util.List;

public class VarLambda {
    public static void main(String[] args) {

        // no java 11 pode-se usar var em lambdas

        List<Integer> lista = Arrays.asList(1,2,3,4,5);

        lista.forEach(
                (var e) -> System.out.println(e)
        );
    }
}
