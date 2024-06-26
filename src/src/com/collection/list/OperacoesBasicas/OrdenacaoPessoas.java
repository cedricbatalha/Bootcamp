package com.collection.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.collection.list.OperacoesBasicas.Pessoa;

public class OrdenacaoPessoas {

    //atributo
    private List<Pessoa> pessoaList;

    //construtor
    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    //metodo
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    //compareble (na classe Pessoa primeiro)
    public List<Pessoa> ordenarPorIdade(){
        // cria a lista com todas as pessoas ja inclusas dentro do array (array nao inicia vazia)
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;

    }

    //comparator por altura
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new Pessoa.ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoa = new OrdenacaoPessoas();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 30, 1.80);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 25, 1.70);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 17, 1.56);

        System.out.println(ordenacaoPessoa.pessoaList);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }

}
