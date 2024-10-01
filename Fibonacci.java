import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number ");

        int input = scanner.nextInt();

        int firstNumber = 0;
        int secondNumber = 1;

        int lastNumber = 0;

        for (int i = 0; i < input; i++) {

            lastNumber = firstNumber + secondNumber;

            System.out.println(lastNumber);

            firstNumber = secondNumber;

            secondNumber = lastNumber;
        }
    }
}
