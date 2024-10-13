import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second integer: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter operator (+, -, *, //): ");
        char operator = scanner.next().charAt(0);

        if (operator == '+') {
            System.out.println("Result: " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("Result: " + (num1 - num2));
        } else if (operator == '*') {
            System.out.println("Result: " + (num1 * num2));
        } else if (operator == '/') {
            if (num2 !=0) {
                System.out.println("Result: " + (num1 / num2));
            } else{
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operator. Please use +, -, * or //.");
        }
    }
}
