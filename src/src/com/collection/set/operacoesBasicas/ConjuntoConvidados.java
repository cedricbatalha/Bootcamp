package com.collection.set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    //atributo c/ set
    private Set<Convidado> convidadoSet;

    //constutor nao recebendo nada e alterando para HashSet
    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    //adicionar convidados
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    //remover convidados
    public void removerConvidadoPorCodigoConvite (int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    //contar convidados
    public int contatConvidados(){
        return convidadoSet.size();
    }

    //listar convidados
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contatConvidados() + " dentro do Set de Convidados");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 2345);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 3456);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 4567);

        //equals and hashcode ativo, nao exibe o Convidado com código igual.

        System.out.println("Existem " + conjuntoConvidados.contatConvidados() + " dentro do Set de Convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existem " + conjuntoConvidados.contatConvidados() + " dentro do Set de Convidados");

        conjuntoConvidados.exibirConvidados();
    }
}
