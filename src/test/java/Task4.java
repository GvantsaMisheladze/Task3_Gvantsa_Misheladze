import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Exchange rate from USD to EUR: ");
        double exchangeRate = scanner.nextDouble();
        System.out.println("Amount in USD to be exchange: ");
        double amountInUSD = scanner.nextDouble();
        System.out.println("Exchange fee percentage: ");
        double feePercentage = scanner.nextDouble();

        double euroReceived = amountInUSD * exchangeRate * (1 - feePercentage / 100);
        System.out.println("The amount of EUR the user will receive: " + euroReceived);
    }
}
