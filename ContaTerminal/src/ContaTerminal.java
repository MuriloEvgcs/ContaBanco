import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o número da sua conta: ");
        int numAccount = scanner.nextInt();

        System.out.println("Digite sua agência: ");
        String agency = scanner.next();

        System.out.println("Digite seu nome: ");
        String name = scanner.next();

        System.out.println("Digite seu saldo: ");
        double balance = scanner.nextDouble();

        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é: %s, conta %d e seu saldo é %.2f. Já está disponível para saque!",
                name, agency, numAccount, balance);
        System.out.println(mensagem);
    }
}