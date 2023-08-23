package qn1outofbound;

import java.util.Arrays;
import java.util.Scanner;

public class Qn1OutOfBound {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray = new int[100];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(myArray));

        System.out.println("The index serial is ");
        int userInput = input.nextInt();
        try {
            int number = myArray[userInput];
            System.out.println("The number is " + number);

        } catch (ArrayIndexOutOfBoundsException f) {
            System.out.println(f);
        }
    }

}
