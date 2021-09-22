package br.com.estudos.java10;

import java.util.ArrayList;
import java.util.List;

public class CopyOf {
    public static void main(String[] args) {

//        cria uma copia imutavel de uma lista qualquer

        List<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(7);
        lista.add(3);
        lista.add(4);
        lista.add(2);
        lista.add(4);

        List<Integer> listaCopia = List.copyOf(lista);

        System.out.println(lista);
        System.out.println(listaCopia);


//        nao e possivel adicionar nada a lista copiada

//        listaCopia.add(1);
//        System.out.println(listaCopia);

    }
}
