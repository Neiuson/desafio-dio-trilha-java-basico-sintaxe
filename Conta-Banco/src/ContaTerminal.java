import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por Favor, digite o seu nome !");
    String nome = scanner.next();

    System.out.println("Por Favor, digite o seu sobrenome !");
    String sobrenome = scanner.next();

    System.out.println("Por Favor, digite o número de sua Agência! seguindo o exemplo 000-0 ");
    String agencia = scanner.next();

    System.out.println("Por Favor, digite o número da conta !");
    int numero = scanner.nextInt();

    System.out.println("Por Favor, insira o valor que deseja depositar em sua conta  !");
    double saldo = scanner.nextDouble();

 System.out.println(" Olá " + nome +" "+ sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        
}
}
