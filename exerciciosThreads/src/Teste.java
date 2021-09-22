//http://www.inf.ufes.br/~pdcosta/ensino/2008-1-sistemas-operacionais/Slides/Aula17-1slide.pdf

public class Teste {

    public static void main(String[] args) throws InterruptedException {

        TesteThredsRunnable thread1 = new TesteThredsRunnable("1", 100);
        TesteThredsRunnable thread2 = new TesteThredsRunnable("2", 1000);
        TesteThredsRunnable thread3 = new TesteThredsRunnable("3", 500);

    }
}
