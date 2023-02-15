import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cliente = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor,digite o número da sua conta: ");
        int numero = cliente.nextInt();
        System.out.println("Por favor,digite o número da Agência: ");
        String agencia = cliente.next();
        System.out.println("Por favor,digite o seu nome: ");
        String nomeCliente = cliente.next();
        cliente.nextLine();
        System.out.print("Por favor,digite seu saldo: ");
        double saldo = cliente.nextDouble();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco,sua agência é: " + agencia
                + " ,conta: " + numero + " ,seu saldo: " + saldo);
    }
}
