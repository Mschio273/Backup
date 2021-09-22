package br.com.estudos.threads;

public class TestandoWait implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i<20; i++) {
            System.out.println(i);

            if(i == 10) {
                System.out.println("estou dormindo");
                try {
                    synchronized (this){
                        wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
