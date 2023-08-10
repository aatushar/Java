package midtermpratice;

import java.util.Scanner;

public class MidtermPratice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.err.println("Entre first number");
//        int number1 = input.nextInt();
//
//        System.out.println("Entre 2nd number ");
//        int number2 = input.nextInt();
//
//        System.out.println("Entre 3rd number ");
//        int number3 = input.nextInt();
//
//        int maxNumber = 0;
//
//        if (number1 > number2 && number1 > number3) {
//            maxNumber = number1;
//        } else if (number2 > number1 && number2 > number3) {
//            maxNumber = number2;
//
//        } else {
//            maxNumber = number3;
//        }
//        System.out.println("The max number is " + maxNumber);
//        System.out.println("Entre item numbers");
//        int i = input.nextInt();
//        int max = 0;
//        int min = 9999999;
//        int inputNumber;
//    
//        
//        
//
//        while (i > 0) {
//            System.out.println("Entre number");
//            inputNumber = input.nextInt();
//            if (max < inputNumber) {
//                max = inputNumber;
//            }
//            if (min > inputNumber) {
//                min = inputNumber;
//            }
//
//            i--;
//        }
//      
//
//        System.out.println("max number is " + max);
//        System.out.println("min number is " + min);
//
        int sc = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= sc; i++) {
            if (sc % i == 0) {
                sum = sum + 1;
            }
        }
        if (sum == 2) {
            System.out.println(sc + " is a prime number");
        } else {
            System.out.println(sc + " is not a prime numbeer");

        }
    }
}
