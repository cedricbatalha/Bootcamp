public class ExemploFor {
    public static void main (String[] args){
        for (int carneirinhos = 1; carneirinhos <=20; carneirinhos++){
            System.out.println("Contando carneirinhos " + carneirinhos);
        }

        System.out.println("Joãozinho Dormiu");


        //For em Arrays (inicia em 0)
        String alunos[] = {"Felipe", "Jonas", "Julia", "Marcos"};

        for (int x=0; x < alunos.length; x++){
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }


        /// For each
        for (String aluno : alunos){
            System.out.println("Nome do alino é: " + aluno);
        }
    }
}
