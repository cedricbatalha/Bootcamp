package poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Desafio1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Lê a Entrada que informa o saldo inicial da conta
            double saldo = scanner.nextDouble();

            // Lê a Entrada com a quantidade total de transações
            int quantidadeTransacoes = scanner.nextInt();

            // Lista para armazenar as transações
            List<String> transacoes = new ArrayList<>();

            // Loop para iterar sobre as transações
            for (int i = 1; i <= quantidadeTransacoes; i++) {
                // Lê a Entrada com o tipo de transação (D para depósito ou S para saque)
                // O método "toUpperCase" padroniza o tipo de transação com a letra maiúscula
                char tipoTransacao = scanner.next().toUpperCase().charAt(0);
                // Lê a Entrada com o valor da transação
                double valorTransacao = scanner.nextDouble();

                // Atualiza o saldo da conta e adicionar a transação à lista
                if (tipoTransacao == 'D') {
                    saldo += valorTransacao;
                    transacoes.add(i + ". Deposito de " + valorTransacao +"\n");
                } else if (tipoTransacao == 'S') {
                    saldo -= valorTransacao;
                    transacoes.add(i + ". Saque de " + valorTransacao+"\n");
                } else {
                    System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                    i--; // Decrementa o índice para repetir a iteração
                }
            }

            /*
            2500
            2
            d
            100
            s
            500

            Saldo: 2100.0
            Transacoes:
            1. Deposito de 100.0
            2. Saque de 500.0
            */


            // TODO: Exibir o saldo final e a lista de transações conforme a tabela de Exemplos.
            System.out.println("Saldo: " + saldo);
            System.out.println("Transacoes:");
            System.out.println(transacoes.toString().replaceFirst(", ", "").replace("[", "").replaceFirst("]", ""));
            //System.out.println(transacoes.toString().replaceFirst(",", "").replaceFirst("[", "").replaceFirst("]", ""));
            //System.out.printf((String.valueOf(transacoes)) + "\n");

            // Fechar o scanner para evitar vazamentos de recursos
            scanner.close();
        }

}
