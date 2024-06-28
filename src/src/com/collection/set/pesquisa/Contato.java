package com.collection.set.pesquisa;

import java.util.Objects;

public class Contato {

    //atributos
    private String nome;
    private int numero;

    //construtor
    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    //set (pois vamos querer alterar o número)
    public void setNumero(int numero) {
        this.numero = numero;
    }

    //get
    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    //equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    //title
    @Override
    public String toString() {
        return nome + ", " + numero;
    }
}
