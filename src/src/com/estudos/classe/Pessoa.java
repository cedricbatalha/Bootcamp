package com.estudos.classe;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    //Construtor
    public Pessoa (String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    /*
    public void setEndereco(String newEndereco) {
        endereco = newEndereco;
    }
    */
}
