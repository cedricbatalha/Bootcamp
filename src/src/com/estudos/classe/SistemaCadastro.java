package com.estudos.classe;

public class SistemaCadastro {
    public static void main(String[] args) {

        // puxa do construtor. Top!
        Pessoa marcos = new Pessoa("123", "Marcos");

        marcos.setEndereco("Rua das Marias");

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
