package com.estudos.poo.heranca;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("58554");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("545447");
        z400.ligar();

        Veiculo coringa = jeep;
        //Veiculo coringa = z400;
        coringa.ligar();
    }
}
