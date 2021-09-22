public class AssistenteDeGerente extends Funcionario implements Bonificacao {

    public AssistenteDeGerente(String nome, int telefone, double salario, String senha) {
        super(nome, telefone, salario, senha);
    }

    @Override
    public double bonus() {
        return getSalario() * 1.02;
    }

    @Override
    public void exibeDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Salario: " + getSalario());
        System.out.println("Salario com bonus:  " + bonus());
    }
}
