//To Do: conhecer e importar a classe Scanner
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
        public static void main(String[] args) {

            Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

            /*
            //Exibir as mensagens para o nosso usuário
            System.out.println("Digite seu nome");

            //Obter pela scanner os valores digitados no terminal
            String nomeCliente = scanner.next();
            */

            //Agencia
            System.out.println("Programa: Por favor, digite o número da Agência!");
            String numeroAgencia = scanner.next();

            //NumeroConta
            System.out.println("Usuário");
            int numeroConta = scanner.nextInt();

            /*
            //Saldo
            System.out.println("Digite sua Conta");
            double saldo = scanner.nextDouble();
            */

            //Fixar valores
            String nomeCliente = "MARIO ANDRADE";
            Double saldo = 237.48;

            //Exibir a mensagem conta criada
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + " conta " + numeroConta + " e seu saldo R$ " + saldo + " já está disponível para saque.");

        }
    }