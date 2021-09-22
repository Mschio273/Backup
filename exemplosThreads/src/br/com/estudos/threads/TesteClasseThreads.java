package br.com.estudos.threads;

public class TesteClasseThreads extends Thread{

    private String nome;

    public TesteClasseThreads(String nome) {
        this.nome = nome;
        start();
    }

    @Override
    public void run() {
        try {
            System.out.println(nome + " testando");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(nome + " terminou a execução");
    }
}
