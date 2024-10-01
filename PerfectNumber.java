import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");

        int input = scanner.nextInt();

        int sum = 0;

        int i = 1;

        while (i <= input / 2) {

            if (input % i == 0) {

                sum = sum + i;
            }

            i++;
        }

        if (sum == input ) {
            
            System.out.println("Number is Perfect Number!");
        }else{
            System.out.println("Number is not perfect number!");
        }
    }
}
