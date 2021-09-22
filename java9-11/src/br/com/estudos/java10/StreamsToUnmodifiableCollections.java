package br.com.estudos.java10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsToUnmodifiableCollections {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(3);
        lista.add(5);
        lista.add(6);

        lista.stream()
                .collect(Collectors
                        .toUnmodifiableList()
//                        .toUnmodifiableMap()
//                        .toUnmodifiableSet()
        );
    }
}
