package poo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);
        String titular = scanner.next();
        int numeroConta = scanner.nextInt();
        double saldo = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();

        ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, titular, saldo, taxaJuros);

        System.out.println("Conta Poupanca:");
        contaPoupanca.exibirInformacoes();
    }
}

class ContaBancaria {
    protected int numero;
    protected String titular;
    protected double saldo;
    protected double taxaJuros;

    public ContaBancaria(int numero, String titular, double saldo, double taxaJuros) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.taxaJuros = taxaJuros;
    }

    public void exibirInformacoes() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println(titular);
        System.out.println(numero);
        System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
        System.out.println("Taxa de juros: " + taxaJuros + "%");
    }
}

class ContaPoupanca extends ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;
    private double taxaJuros;

    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        super(numero, titular, saldo, taxaJuros);
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.taxaJuros = taxaJuros;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        //TODO: Complementar as informações com a taxa de juros.
    }
}
