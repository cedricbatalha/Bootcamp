package com.estudos.poo.interfaces.equipamentos.impressora;

import com.estudos.poo.interfaces.equipamentos.impressora.Impressora;

public class Deskjet implements Impressora {

    @Override
    public void imprimir() {
        System.out.println("Imprimindo Deskjet");
    }
}
