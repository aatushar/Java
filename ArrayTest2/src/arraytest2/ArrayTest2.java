package arraytest2;

import java.util.Arrays;

public class ArrayTest2 {

    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
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
        System.out.println("The max number serial is " + maxIndex);
        System.out.println("The min number serial is " + minIndex);
    }

}
