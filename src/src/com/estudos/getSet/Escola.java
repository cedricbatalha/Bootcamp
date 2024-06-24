package com.estudos.getSet;

public class Escola {
    public static void main(String[] args){
        Aluno felipe = new Aluno();
        felipe.setAluno("Felipe");
        felipe.setIdade(12);

        System.out.println(felipe.getAluno() + felipe.getIdade());
    }
}
