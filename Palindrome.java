import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");

        int input = scanner.nextInt();

        int sum = 0;

        int temp = input;

        while (input > 0) {

            int lastDigit = input % 10;

            sum = sum * 10 + lastDigit;

            input = input / 10;
        }

        if (sum == temp) {
            
            System.out.println("Number is Palindrome");
        }else{
            System.out.println("number is not a Palindrome");
        }
    }
}
