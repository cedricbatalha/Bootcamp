package com.estudos.poo.encapsulamento;

public class Carro {
    public void ligar(){
        confereCambio();
        confereCombistivel();
        System.out.println("Carro Ligado");
    }

    private void confereCambio(){
        System.out.println("Conferindo Combustivel");
    }
    private void confereCombistivel(){
        System.out.println("Conferindo Cambio");
    }
}
