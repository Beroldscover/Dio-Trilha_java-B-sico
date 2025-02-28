import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try (// Vou estar fazendo um scanner para poder digitar todos os dados solicitado direto pelo terminal.
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US)) {
            System.out.println("Digite Numero da conta");
            int NumeroConta = scanner.nextInt();

            System.out.println("Digite Sua Agencia");
            String NumeroAgencia = scanner.next();

            System.out.println("Digite Seu Nome");
            String NomeCliente = scanner.next();

            System.out.println("Digite Seu Sobrenome");
            String SobrenomeCliente = scanner.next();
            double Saldo = 237.48; //Utilizei desse formato, pois como é um numero fixo, para usar como banco de dados de um saldo que ele ja tenha em sua conta.

            System.out.println("Olá, Seu " + NomeCliente + " " + SobrenomeCliente);
            System.out.println("Sua Conta é " + NumeroConta);
            System.out.println("Sua agencia é " + NumeroAgencia);
            System.out.println("Seu saldo é " + Saldo);
        }
    }
}
