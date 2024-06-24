package com.estudos.enums;

public class SistemaIBGE {
    public static void main(String[] args) {
        for (EstadoBrasileiro e : EstadoBrasileiro.values()) {
            System.out.println(e.getSigla() + " - " + e.getNome() + " - " + e.getIbge());
        }

        EstadoBrasileiro eb = EstadoBrasileiro.SAO_PAULO;
        System.out.println(eb.getNome() + eb.getNomeMaiusculo());
    }
}
