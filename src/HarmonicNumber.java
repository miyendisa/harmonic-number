import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, i;
        double sum = 0;
        System.out.print("Enter the harmonic number (n) : ");
        number = scanner.nextInt();

        for (i = 1; i <= number; i++) {
            sum += (1.0 / i);
        }
        System.out.print("Answer: " + sum);
    }
}
