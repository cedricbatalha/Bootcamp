package com.collection.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    //atributo
    //importar list
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    //adicionar na lista
    public void adicionarTarefa (String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    //pega cada tarefa e percorre uma lista para remover
    public void removerTarefa (String descricao){
        List<Tarefa> tarefasParaERemover = new ArrayList<>();
        for (Tarefa t : tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaERemover.add(t);
            }

        }
        tarefaList.removeAll(tarefasParaERemover);
    }

    //retorna o total
    public int obterNumeroTotalDeTarefas(){
        return tarefaList.size();
    }

    //retorna a lista
    public void obterDewscricoesTarefas(){
        System.out.println(tarefaList);
    }


    //teste psvm
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O numero total de elementos da lista é " + listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O numero total de elementos da lista é " + listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.removerTarefa("Tarefa 2");
        System.out.println("O numero total de elementos da lista é " + listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.obterDewscricoesTarefas();
    }
}
