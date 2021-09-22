public class TestarAnimais {
    public static void main(String[] args) {

        Animal camelo = new Animal("camelo", 150, 4, "amarelo", "terra", 2.0);

        Animal tubarao = new Peixe("tubarao", 300, 0, "cinzento", "mar", 1.5, "barbatanas e cauda");

        Animal ursoCanada = new Mamifero("Urso-do-canada", 180, 4, "vermelho", "terra", 0.5, "mel");

        camelo.dados();
        System.out.println();
        tubarao.dados();
        System.out.println();
        ursoCanada.dados();

    }
}
