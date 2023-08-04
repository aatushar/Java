package arraytest3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre Your array size  ");
        int arraysixe = input.nextInt();

        int[] numbers = new int[arraysixe];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Entre your number ");
            int in = input.nextInt();
            numbers[i] = in;

        }

        int max = numbers[0];
        int min = numbers[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];

            max = number > max ? number : max;
            min = number < min ? number : min;

            if (number == max) {
                maxIndex = i;

            }
            if (number == min) {
                minIndex = i;
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("The max number is " + max);
        System.out.println("The min number is " + min);
        System.out.println("The max serial number is " + maxIndex);
        System.out.println("The min serial number is " + minIndex);
    }
}
