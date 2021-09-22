package br.com.estudos;

import br.com.estudos.threads.MinhaThreadSoma;

public class Teste {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        MinhaThreadSoma t1 = new MinhaThreadSoma("T1", array);
        MinhaThreadSoma t2 = new MinhaThreadSoma("T2", array);
        MinhaThreadSoma t3 = new MinhaThreadSoma("T2", array);
        MinhaThreadSoma t4 = new MinhaThreadSoma("T2", array);
        MinhaThreadSoma t5 = new MinhaThreadSoma("T2", array);
        MinhaThreadSoma t6 = new MinhaThreadSoma("T2", array);

        


        //15
    }

}