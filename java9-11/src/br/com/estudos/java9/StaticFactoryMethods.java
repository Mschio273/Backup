package br.com.estudos.java9;

import java.util.Arrays;
import java.util.List;

public class StaticFactoryMethods {

    //metodos estaticos usados para construir objetos

    public static void main(String[] args) {

        Integer cem = Integer.valueOf(100);
        Integer duzentos = Integer.valueOf(200);
        Integer trezentos = Integer.valueOf(300);

        // Como fazia antes
        List<Integer> list2 = Arrays.asList(cem, duzentos, trezentos);

        // Formato Novo no Java 9
        List<Integer> of1 = List.of();
        List<Integer> of2 = List.of(cem);
        List<Integer> of3 = List.of(cem, duzentos);
        List<Integer> of4 = List.of(cem, duzentos, trezentos);

        // Imutável
//        of1.add(cem);

//        Map.of(k1, v1)
//        Set.of(e1, e2)
    }

}











