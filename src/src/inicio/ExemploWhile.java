package inicio;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {

        double mesada = 50.0;
        while (mesada > 0){

            Double valorDoce = valorAleatorio();

            /* para não dar negativo
            if(valorDoce > mesada)
                    valorDoce = mesada;
             */

            System.out.println("Doce do valor: " + valorDoce + "Adicionado no carrinho");

            mesada = mesada - valorDoce;

        }
        System.out.printf("Mesada: " + mesada);
        System.out.printf("Joãozinho gastou toda a sua mesada em doces");

    }

    // Valor aleatório
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
