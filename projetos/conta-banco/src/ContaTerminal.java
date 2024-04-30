import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome:");
        String nomeCliente = scanner.next();
        System.out.println("Insira o número da agência:");
        String agencia = scanner.next();
        System.out.println("Insira o número da conta:");
        int numeroConta = scanner.nextInt();
        scanner.close();

        double saldo = 0;

        String finalMessage = "Olá " + nomeCliente 
            + ", obrigado por criar uma conta em nosso banco, sua agência é "
            + agencia + ", conta " + numeroConta + ", e seu saldo " + saldo
            + " já está disponível para saque.";

        System.out.println(finalMessage);
    }
}
