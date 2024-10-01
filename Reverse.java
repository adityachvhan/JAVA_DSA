// Reverse the given number using scanner class

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Emter the number");

        int input = scanner.nextInt();
             
              // 0 > 0  (False)
        while (input > 0) {
              
            int last = input % 10;   // 1 % 10 = 0.1

            System.out.print(last + ""); // 3 2 1

            input = input / 10;   // 1 / 10 = 0

        }

    }

}
