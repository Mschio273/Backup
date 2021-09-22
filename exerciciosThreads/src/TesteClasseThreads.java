public class TesteClasseThreads extends Thread{

    private String nome;
    private int tempo;

    TesteClasseThreads(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        start();
    }

    @Override
    public void run() {
        try {
            System.out.println(nome + " testando");
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(nome + " terminou a execução");
    }
}
