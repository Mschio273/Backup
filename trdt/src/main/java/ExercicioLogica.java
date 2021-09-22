import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioLogica {
    //remover elementos duplicados de uma lista

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(3);
        lista.add(4);
        lista.add(4);
        lista.add(1);
        lista.add(6);
        lista.add(7);
        lista.add(4);
        lista.add(1);

        List<Integer> novaLista = lista.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(novaLista);

    }
}
