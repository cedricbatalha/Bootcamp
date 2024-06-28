package principios;

public class Main {
    public static void main(String[] args) {

        Cliente Cedric = new Cliente();
        Cedric.setNome("Cedric");

        //polimorfismo, pode usar qualquer um que vai funcionar (Conta).
        Conta cc = new ContaCorrente(Cedric);
        Conta cp = new ContaPoupanca(Cedric);


        cc.depositar(100);

        //usando o polimorfismo
        cc.transferir(100,cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
