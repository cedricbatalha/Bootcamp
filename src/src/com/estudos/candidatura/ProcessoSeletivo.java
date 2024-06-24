package com.estudos.candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main (String [] args){

        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }

        /*
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
         */

        //selecaoCandidatos();
        //imprimirSelecionados();
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando)
                tentativasRealizadas++;

            else
                System.out.println("Contato realizado com sucesso");

        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu)
            System.out.println("Conseguimos contato com o candidato " + candidato + " na " + tentativasRealizadas + " da ligação.");
        else
            System.out.println("O candidato " + candidato + " NÃO atendeu a ligação.");
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        System.out.println("Imprimindo a lista de candidatos indormando o indice do elemento");

        for (int indice=0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº " + (indice+1) + " é o " + candidatos[indice]);
        }

        System.out.println("Forma abreviada");
        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos (){
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabrcio", "Mirela", "Daniela", "Jorge"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos [candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O Candidato " + candidato + " solicitou este valor de Salário " + salarioPretendido);

            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }

    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido) {
            System.out.println("Ligar para o Candidato");
        }
        else if (salarioBase == salarioPretendido){
            System.out.println("Ligar para o Candidato com Contra Proposta");
        }
        else{
            System.out.println("Aguardando Resultado demais Candidatos");
        }
    }
}
