import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, Seja bem vindo!");

        System.out.println("Para realizar o login, eu preciso das seguintes informações: ");

        System.out.print("Informe Seu Primeiro Nome: ");
        String nome = scanner.next();

        System.out.print("Por gentielza, informe o numero da sua agência: ");
        String agencia = scanner.next();

        System.out.print("Por gentileza, informe o numero da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Por gentileza, Digite o saldo da conta: ");
        double saldoConta = scanner.nextDouble();

        System.out.println("Olá " + nome + ",obrigado por utilizar nosso banco, sua agência é " + agencia + " conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque");
    }
}
