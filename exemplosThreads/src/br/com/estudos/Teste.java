package br.com.estudos;

import br.com.estudos.threads.TesteClasseThreads;
import br.com.estudos.threads.TesteInterfaceRunnable;

public class Teste {

    public static void main(String[] args) {
        TesteInterfaceRunnable thread1 = new TesteInterfaceRunnable("1", 100);
        TesteInterfaceRunnable thread2 = new TesteInterfaceRunnable("2", 200);
        TesteClasseThreads t1 = new TesteClasseThreads("t1");
        TesteClasseThreads t2 = new TesteClasseThreads("t2");

    }
}

