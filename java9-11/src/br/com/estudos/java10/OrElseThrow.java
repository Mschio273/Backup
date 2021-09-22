package br.com.estudos.java10;

import java.util.Arrays;
import java.util.List;

public class OrElseThrow {
    public static void main(String[] args) {

//        orElseThrow agora quando nao recebe nenhum argumento lança uma excessao NoSuchElementException

        List<Integer> lista = Arrays.asList(1,2,3,4,5);

        Integer teste = lista.stream()
                .filter(i -> i % 2 == 0)
                .findFirst()
                .orElseThrow();

        System.out.println(teste);
    }
}
