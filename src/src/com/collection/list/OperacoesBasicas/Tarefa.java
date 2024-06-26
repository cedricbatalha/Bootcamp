package com.collection.list.OperacoesBasicas;

public class Tarefa {

    //atributo
    private String descricao;

    // construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }


    //getter
    public String getDescricao() {
        return descricao;
    }

    //ToString
    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                '}';
    }

}
