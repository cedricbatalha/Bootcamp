package poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Desafio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();

        List<Transacao> transacoes = new ArrayList<>();

        for (int i = 1; i <= quantidadeTransacoes; i++) {

            char tipoTransacao = scanner.next().charAt(0);
            double valorTransacao = scanner.nextDouble();

            // TODO: Criar uma nova transação e adicioná-la à lista de transações
            Transacao transacao = null;
            //transacoes.add(new Transacao(tipoTransacao, valorTransacao));

            // Verifica e atualiza o saldo da conta com base no tipo de transação
            if (transacao.getTipo() == 'd') {
                saldo += valorTransacao;
            } else if (transacao.getTipo() == 's') {
                saldo -= valorTransacao;
            }

            //Saldo : 90.0
            //Transacoes:
            //d de 10.0
            //s de 20.0
        }

        /*
            100
            2
            d
            10
            s
            20


             */

        System.out.println("\nSaldo : " + saldo);
        System.out.println("\nTransacoes:");
        transacoes.stream()
                .map(transacao -> "TODO: Formatar a Saída (tipo e valor) de acordo com os Exemplos.")
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

class Transacao {
    private char tipo;
    private double valor;

    public Transacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}