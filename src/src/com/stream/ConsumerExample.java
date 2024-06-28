package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar um valor.
 */
public class ConsumerExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar o Consumer com expressão lambda para imprimir números pares
        //argumento -> corpo
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        //foreach que vai imprimir
        numeros.stream().forEach(imprimirNumeroPar);

        // Usar o Consumer para imprimir números pares no Stream
        //mescla
        numeros.forEach(n -> {
            if(n %2 == 0){
                System.out.println(n);
            }
        });

        //lambda
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        //Usar o consumer raiz
        numeros.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n % 2 == 0;
            }
        });

    }
}