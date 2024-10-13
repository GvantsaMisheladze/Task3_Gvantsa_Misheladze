import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value for a (a != 0): ");
        double a = scanner.nextDouble();

        System.out.println("Enter the value for b (b != 0): ");
        double b = scanner.nextDouble();

        System.out.println("Enter the value for c (c >= 0): ");
        double c = scanner.nextDouble();

        double topPart = Math.pow(a, 3) + Math.pow(b, 2) - Math.sqrt(c);
        double bottomPart = a * b + c;
        double x = topPart / bottomPart;

        System.out.println("The result of the expression is: " + x);
    }
}
