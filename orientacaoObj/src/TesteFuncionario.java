public class TesteFuncionario {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Rafael", 983464567, 5402.24, "a1234b5");
        Estagiario estagiario = new Estagiario("Matheus", 981053148, 1000, "4321");
        AssistenteDeGerente assistenteDeGerente = new AssistenteDeGerente(
                "Nelson", 987652396, 4364.89, "1234"
        );

        validarSenha(gerente);

        gerente.exibeDados();
        System.out.println();

        validarSenha(estagiario);

        estagiario.exibeDados();
        System.out.println();

        validarSenha(assistenteDeGerente);

        assistenteDeGerente.exibeDados();

        System.out.println();
        System.out.println("Numero de funcionarios: " + Funcionario.getNumeroDeFuncionarios());
    }

    private static void validarSenha(Funcionario funcionario) {
        try {
            ControleDeLogin controleDeLogin = new ControleDeLogin();
            controleDeLogin.validaSenha(funcionario);
        } catch (SenhaInvalidaException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println();
        }
    }
}
