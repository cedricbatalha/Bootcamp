package poo.Desafio2;

import com.collection.list.OperacoesBasicas.Tarefa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RegistroTransacoesComStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();

        List<Transacao> transacoes = new ArrayList<>();

        for (int i = 1; i <= quantidadeTransacoes; i++) {

            char tipoTransacao = scanner.next().charAt(0);
            double valorTransacao = scanner.nextDouble();

            // TODO: Criar uma nova transação e adicioná-la à lista de transações
            Transacao transacao = new Transacao(tipoTransacao,valorTransacao);
            //transacoes.add(new Transacao(tipoTransacao, valorTransacao));


            // Verifica e atualiza o saldo da conta com base no tipo de transação
            if (transacao.getTipo() == 'd') {
                saldo += valorTransacao;
                transacoes.add(new Transacao(tipoTransacao,valorTransacao));

            } else if (transacao.getTipo() == 's') {
                saldo -= valorTransacao;
                transacoes.add(new Transacao(tipoTransacao,valorTransacao));
            }

            //System.out.println("Saldo : " + saldo);
            //System.out.println(tipoTransacao + " de " + valorTransacao);

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

            5000
            1
            d
            500


             */

        System.out.println("Saldo : " + saldo);
        System.out.println("Transacoes:");
        transacoes.stream()
                .map(transacao -> transacao.getTipo() + " de " + transacao.getValor())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }

}
