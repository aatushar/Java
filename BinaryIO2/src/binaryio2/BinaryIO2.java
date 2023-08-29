package binaryio2;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryIO2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray = new int[100];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 100);

        }

        System.out.println(Arrays.toString(myArray));

        System.out.println("Enre the Index serial no ");
        int userInput = input.nextInt();

        try {
            int value = myArray[userInput];
            System.out.println("The serial number is " + value);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }
    }

}
