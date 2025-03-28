import java.util.Scanner;
public class Entrada {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Digite seu nome:");
       String nome = scanner.nextLine();

       System.out.println("Digite a sua iade:");
       int idade = scanner.nextInt();
       scanner.close();
       System.out.println("Olá " + nome +", voce tem " + idade + " anos," );
       scanner.close();
    }

}
