package com.collection.list.pesquisar;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    //atritubo e importacao UtilList
    private List<PesquisaListLivro> livroList;

    //Construtor (apagou o que recebe e informou para ter um array vazio
    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    //Método Pesquisar
    public void adicionarLivro (String titulo, String autor, int anoPublicacao){
        livroList.add(new PesquisaListLivro(titulo, autor, anoPublicacao));
    }

    public List<PesquisaListLivro> pesquisarPorAutor(String autor){
        List<PesquisaListLivro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (PesquisaListLivro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    };

    //pesquisa por range de anos
    public List<PesquisaListLivro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<PesquisaListLivro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(PesquisaListLivro l : livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    //pesquisa só o primeiro livro
    public PesquisaListLivro pesquisarPorTitulo(String titulo){
        PesquisaListLivro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(PesquisaListLivro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    //Criar Main
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2001);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2002);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2003);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 3", 2004);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 5", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 3"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1993,1995));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }



}

