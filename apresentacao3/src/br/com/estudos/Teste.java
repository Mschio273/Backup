package br.com.estudos;

import br.com.estudos.threads.TestandoNotify;
import br.com.estudos.threads.TestandoWait;

public class Teste {

    public static void main(String[] args) {

        TestandoWait t1 = new TestandoWait();
        TestandoNotify t2 = new TestandoNotify();

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread1.start();
        thread2.start();
    }
}
