package com.estudos.poo.interfaces.equipamentos.multifuncional;

import com.estudos.poo.interfaces.equipamentos.copiadora.Copiadora;
import com.estudos.poo.interfaces.equipamentos.digitalizadora.Digitalizadora;
import com.estudos.poo.interfaces.equipamentos.impressora.Impressora;

//Java não permite herança multipla
public class EquipamentoMultiFuncional implements Copiadora, Digitalizadora, Impressora {
    @Override
    public void copiar() {
        System.out.println("copiando via equipamento multifuncional");
    }

    @Override
    public void digitalizar() {
        System.out.println("digitalizando via equipamento multifuncional");
    }

    @Override
    public void imprimir() {
        System.out.println("imprimindo via equipamento multifuncional");
    }
}
