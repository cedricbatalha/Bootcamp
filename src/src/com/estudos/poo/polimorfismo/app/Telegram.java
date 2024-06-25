package com.estudos.poo.polimorfismo.app;

import com.estudos.poo.polimorfismo.utilitary.ServicoMensagemInstantanea;

public class Telegram extends ServicoMensagemInstantanea {

    public void enviarMensagem(){
        //valida com classe protected somente com os filhos do pacote
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
    }

    public void receberMensagem(){
        System.out.println("Enviando mensagem pelo Telegram");
    }
}
