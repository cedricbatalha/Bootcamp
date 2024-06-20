public class ExemploBreaakContinue {

    public static void main(String[] args) {
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                break;
                // continue (1, 2, 4, 5);

            System.out.println(numero);
        }
    }
}
