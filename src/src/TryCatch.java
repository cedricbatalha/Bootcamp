import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;
public class TryCatch{
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite a Altura");
            double altura = scanner.nextDouble();


            System.out.println("Olá, me chamo " + nome.toUpperCase() + "" + sobrenome);
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + " cm");
            scanner.close();
        }
        catch (InputMismatchException e){
            System.err.println("Os campos idade e altura precisam ser numéricos");
        }

        /*
        CHECKED and UNCHECKED EXCEPTIONS

        //1
        Number valor = Double.valueOf("a1.75");
        System.out.println(valor);

        //2
        Number valor;
        try{
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        } catch (ParseException e){
            e.printStackTrace();
        }
         */
    }


}
