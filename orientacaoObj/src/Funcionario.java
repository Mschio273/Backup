public abstract class Funcionario {

    private static int numeroDeFuncionarios;
    private String nome;
    private int telefone;
    private double salario;
    private String senha;

    public Funcionario (String nome, int telefone, double salario, String senha) {
        Funcionario.numeroDeFuncionarios++;
        this.nome = nome;
        this.telefone = telefone;
        this.salario = salario;
        this.senha = senha;
    }

    public abstract void exibeDados();

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public static int getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public static void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
        Funcionario.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
