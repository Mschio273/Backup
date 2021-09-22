
public class App {

    public static void main(String[] args) {
       Rest rest = new Rest();
       System.out.println(rest.result(5));

    }

    static class Rest {

        int multi = 2781;

        public int result(int valor) {
            return mult(valor);
        }

        private int mult(int valor) {
            return valor * 124 * multi;
        }
    }
}
