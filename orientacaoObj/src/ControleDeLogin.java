public class ControleDeLogin {

    private static final String DEFAULT_PASSWORD = "a1234b5";

    public boolean validaSenha(Funcionario funcionario) {

        if(funcionario.getSenha().equals(DEFAULT_PASSWORD)) {
            return true;
        }

        throw new SenhaInvalidaException("Senha inválida");


    }
}
