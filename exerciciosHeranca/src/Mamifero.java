public class Mamifero extends Animal {

    private String alimento;

    public Mamifero(String nome, double comprimento, int numeroDePatas, String cor, String ambiente, double velocidadeMedia, String alimento) {
        super(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMedia);
        this.alimento = alimento;
    }

    public void dados() {
        super.dados();
        System.out.println(getAlimento());
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
}
