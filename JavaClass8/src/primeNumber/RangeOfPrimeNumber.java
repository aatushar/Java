package primeNumber;

import java.util.Scanner;

public class RangeOfPrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Entre your Start number");
        int n1 = input.nextInt();

        System.out.println("Entre your end number");
        int n2 = input.nextInt();

        System.out.println("Enter a number");
        int userInput = input.nextInt();
        int count = 0;
        for (int i = 1; i <= userInput; i++) {
            if (userInput % i == 0) {
                count += 1;
            }
        }
//     end the loop
        if (count == 2) {
            System.out.println("This is a prime number");
        } else {
            System.out.println("This is not a prime number");
        }
    }

}
