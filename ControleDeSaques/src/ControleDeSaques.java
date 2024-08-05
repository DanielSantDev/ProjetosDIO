import java.util.Scanner;
public class ControleDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();

        for (int i = 1; i<=10 ; i++) {

            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            } else {
                limiteDiario -= valorSaque;
                System.out.println("Saque realizado. Limite restante: " + String.format("%.1f", limiteDiario));
            }
        }

        scanner.close();
    }

}
