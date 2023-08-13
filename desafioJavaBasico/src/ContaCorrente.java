import java.util.Locale;
import java.util.Scanner;


public class ContaCorrente {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Olá vamos cadastrar sua conta corrente");
        System.out.println("Digite o numero da sua conta: ");
        int numeroConta = sc.nextInt();
        System.out.println("Digite o numero da sua agencia: ");
        String numeroAgencia = sc.next();
        sc.nextLine(); // Consumir a nova linha pendente
        System.out.println("Digite o seu nome completo: ");

        String nomeCliente = sc.nextLine();

        System.out.println("Digite o saldo da sua conta: ");
        double saldoConta = sc.nextDouble();

        String saldoFormatado = String.format("%.2f", saldoConta); // formatando com duas casas depois da virgula



        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ numeroAgencia +
                " , conta "+ numeroConta +" e seu saldo R$"+ saldoFormatado  +" já está disponível para saque");



        sc.close();
    }
}
