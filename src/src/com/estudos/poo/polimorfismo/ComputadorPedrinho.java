package com.estudos.poo.polimorfismo;

import com.estudos.poo.polimorfismo.app.MSNMessenger;
import com.estudos.poo.polimorfismo.app.FacebookMessenger;
import com.estudos.poo.polimorfismo.app.ServicoMensagemInstantanea;
import com.estudos.poo.polimorfismo.app.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;

        /*
        Não se sabe qual app
        Mas qual um deverá enviar e receber mensagens
         */

        String appEscoolhido = "msn";

        if(appEscoolhido.equals("msn"))
            smi = new MSNMessenger();
        else if(appEscoolhido.equals("fbm"))
            smi = new FacebookMessenger();
        if(appEscoolhido.equals("tlg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();

    }
}
