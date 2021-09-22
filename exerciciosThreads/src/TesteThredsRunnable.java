public class TesteThredsRunnable implements Runnable {

    private String nome;
    private int tempo;

    TesteThredsRunnable(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            System.out.println(nome + " testando");
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("terminou a execução " + nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
