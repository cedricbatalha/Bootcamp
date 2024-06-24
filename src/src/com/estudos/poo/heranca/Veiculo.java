package com.estudos.poo.heranca;


//classe abstrata
public abstract class Veiculo {

    private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    //abstract
    public abstract void ligar();
}
