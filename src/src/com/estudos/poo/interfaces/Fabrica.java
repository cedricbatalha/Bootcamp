package com.estudos.poo.interfaces;

import com.estudos.poo.interfaces.equipamentos.copiadora.Copiadora;
import com.estudos.poo.interfaces.equipamentos.digitalizadora.Digitalizadora;
import com.estudos.poo.interfaces.equipamentos.impressora.Deskjet;
import com.estudos.poo.interfaces.equipamentos.impressora.Impressora;
import com.estudos.poo.interfaces.equipamentos.multifuncional.EquipamentoMultiFuncional;

public class Fabrica {
    public static void main(String[] args) {

        //Console Impressão Classe Deskjet

        //Impressora impressora = new Deskjet();
        //impressora.imprimir();

        EquipamentoMultiFuncional em = new EquipamentoMultiFuncional();

        Deskjet deskjet = new Deskjet();

        Impressora impressora = deskjet;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();


    }
}
