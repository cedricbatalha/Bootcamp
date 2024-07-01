package poo.Desafio;

import java.util.Objects;
import java.util.Scanner;

public class Desafio{
    public static void main(String[] args) {
        // Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();

        // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
        if (tipoCofre.equalsIgnoreCase("digital")) {
            int senhaDigital = scanner.nextInt();
            CofreDigital cofreDigital = new CofreDigital(senhaDigital);
            int confirmaSenha = scanner.nextInt();
            cofreDigital.imprimirInformacoes();
            if(cofreDigital.validarSenha(confirmaSenha)){
                System.out.println("Cofre aberto!");
            }else{
                System.out.println("Senha Incorreta!");
            }
            }
            else if(tipoCofre.equalsIgnoreCase("fisico")){
                CofreFisico cofreFisico = new CofreFisico();
                cofreFisico.imprimirInformacoes();
            }
    }
}
/*
public class Desafio {
    public static void main(String[] args) {
        // Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();

        // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
        switch (tipoCofre) {
            case "fisico":{

                CofreFisico cofreFisico = null;
                cofreFisico = new CofreFisico();
                cofreFisico.imprimirInformacoes();
                break;
            }
            case "digital":{
                CofreDigital cofreDigital = null;

                Integer senha = scanner.nextInt();

                cofreDigital = new CofreDigital(2525);
                cofreDigital.imprimirInformacoes();

                Integer confirmacaoSenha = scanner.nextInt();
                cofreDigital.validarSenha(2525);


                if(confirmacaoSenha == 2525){
                    System.out.println("Cofre aberto!");
                }else{
                    System.out.println("Senha incorreta!");
                }
                break;
            }
            default:
                System.out.println("Indefinido");
        }


    }


}
*/