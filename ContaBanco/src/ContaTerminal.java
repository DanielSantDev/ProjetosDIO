import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero da conta: ");
        numero = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite o numero da agencia");
        agencia = entrada.nextLine();

        System.out.println("Digite o seu nome: ");
        nomeCliente = entrada.nextLine();

        System.out.println("Digite o saldo da sua conta: ");
        saldo = entrada.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é" +
                " " + agencia + " conta " + numero + ", e seu saldo RS" + saldo + " que já está disponível para saque.");

    }

}
