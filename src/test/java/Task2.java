import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Radius of the cone: ");
        double r = scanner.nextDouble();
        System.out.println("Height of the cone: ");
        double h = scanner.nextDouble();
        System.out.println("Slant height of the cone: ");
        double s = scanner.nextDouble();

        double surfaceArea = Math.PI * r * (r +s);
        double volume = (1.0 / 3) * Math.PI * Math.pow(r, 2) * h;

        System.out.println("The surface area of the cone is: " + surfaceArea);
        System.out.println("The volume of the cone is: " + volume);
    }
}
