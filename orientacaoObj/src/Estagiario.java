public class Estagiario extends Funcionario {

    public Estagiario(String nome, int telefone, double salario, String senha) {
        super(nome, telefone, salario, senha);
    }

    @Override
    public void exibeDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Salario: " +getSalario());
    }
}
