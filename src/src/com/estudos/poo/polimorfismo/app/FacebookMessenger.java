package com.estudos.poo.polimorfismo.app;

public class FacebookMessenger extends ServicoMensagemInstantanea {
    public void enviarMensagem(){
        //valida com classe protected somente com os filhos do pacote
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo FacebookMessenger");
    }

    public void receberMensagem(){
        System.out.println("Enviando mensagem pelo FacebookMessenger");
    }
}