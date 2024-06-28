package com.collection.list.pesquisar;

public class PesquisaListLivro {


    //atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;

    // construtor
    public PesquisaListLivro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    //getter
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    //to String
    @Override
    public String toString() {
        return "PesquisaListLivro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}
