import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[5];
        double[] weights = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter score " + (i + 1) + ": ");
            scores[i] = scanner.nextDouble();
            System.out.println("Enter weight " + (i + 1) + ": ");
            weights[i] = scanner.nextDouble();
        }
        double weightedSum = 0;
        double weightSum = 0;
        for (int i = 1; i < 5; i++){
            weightedSum += scores[i] * weights[i];
            weightSum += weights[i];
        }
        double weightedAverage = weightedSum / weightSum;
        System.out.println("The weighted average is: " + weightedAverage);
    }
}
