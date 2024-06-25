package com.estudos.poo.polimorfismo.app;

import com.estudos.poo.polimorfismo.utilitary.ServicoMensagemInstantanea;

public class MSNMessenger extends ServicoMensagemInstantanea {

    public void enviarMensagem(){
        //valida com classe protected somente com os filhos do pacote
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN Messenger");
    }

    public void receberMensagem(){
        System.out.println("Enviando mensagem pelo MSN Messenger");
    }
}
