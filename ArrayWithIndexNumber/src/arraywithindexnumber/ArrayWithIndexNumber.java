package arraywithindexnumber;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayWithIndexNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray = new int[10];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 10);
        }

        System.out.println(Arrays.toString(myArray));

        System.out.println("Entre index number serial ");
        int kgf = input.nextInt();

        try {
            int salar = myArray[kgf];
            System.out.println("The value is " + salar);

        } catch (ArrayIndexOutOfBoundsException f) {
            System.out.println(f);
        }

    }

}
