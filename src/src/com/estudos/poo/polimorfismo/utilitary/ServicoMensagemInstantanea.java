package com.estudos.poo.polimorfismo.utilitary;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //public abstract void salvarHistoricoMensagem();

    // somente os filhos conhecem este modulo
    protected void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }

}
