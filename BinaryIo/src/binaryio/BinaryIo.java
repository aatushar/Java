package binaryio;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryIo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray = new int[100];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 100);

        }

        System.out.println(Arrays.toString(myArray));

        System.out.println("Please write the index serial ");
        int userInput = input.nextInt();

        try {
            int value = myArray[userInput];
            System.out.println("The index number is " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

    }

}
