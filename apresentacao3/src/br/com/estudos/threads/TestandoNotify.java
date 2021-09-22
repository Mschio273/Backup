package br.com.estudos.threads;

public class TestandoNotify implements Runnable{

    @Override
    public void run() {

        synchronized (this) {
            notify();
        }
    }
}
