package com.collection.set.map.operacoesBasicas;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    //atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    //adicionar
    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    //remover
    public void removerContato (String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    //adicionar
    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    //pesquisar por nome
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 5665);
        agendaContatos.adicionarContato("Camila Cavalcante", 11111);
        agendaContatos.adicionarContato("Camila Dio", 685665);
        agendaContatos.adicionarContato("Maria Silva", 111111);
        agendaContatos.adicionarContato("Camila", 444444);

        //Cm HashMap não segue a ordem e se for repetido no metodo put, serve para adicionar ou atualizar (no set é o primeiro que adicionou)
        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Maria Silva");

        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Camila Dio"));
    }
}
