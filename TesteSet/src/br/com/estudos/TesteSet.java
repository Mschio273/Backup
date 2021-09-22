package br.com.estudos;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {
    public static void main(String[] args) {

        Set<Integer> teste = new HashSet<>();

        teste.add(1);
        teste.add(5);
        teste.add(3);
        teste.add(7);
        teste.add(5);

        System.out.println(teste);
    }
}
