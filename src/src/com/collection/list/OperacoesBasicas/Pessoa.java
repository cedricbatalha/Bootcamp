package com.collection.list.OperacoesBasicas;

import java.util.Comparator;

//colocou na classe a referencia pessoa
public class Pessoa implements Comparable<Pessoa>{

    //atributos
    private String nome;
    private int idade;
    private double altura;

    //construtor
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }


    //getter
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    //titulo to string
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }

    //Implementado com Pessoa (integer é int) - Comparable (tb na classe mãe)
    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }

    //Comparator
    static class ComparatorPorAltura implements Comparator<Pessoa>{

        //implementar metodo 2 objetos
        @Override
        public int compare(Pessoa p1, Pessoa p2) {
            return Double.compare(p1.getAltura(), p2.getAltura());
        }
    }
}
