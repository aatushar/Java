

//1.	Find out the conditional Sum until input (-1).
//import java.util.Scanner;
//
//public class LastPractice{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        
//        System.out.println("Enter numbers to calculate conditional sum (enter -1 to stop):");
//        
//        while (true) {
//            int num = scanner.nextInt();
//            
//            if (num == -1) {
//                break;
//            }
//            
//            sum += num;
//        }
//        
//        System.out.println("Conditional sum is: " + sum);
//        
//        scanner.close();
//    }
//}


//2 Print an Array and sum of the Array elements.
//public class LastPractice {
//    public static void main(String[] args) {
//        int[] array = { 5, 10, 15, 20, 25 }; // Example array
//        
//        // Print the array elements
//        System.out.print("Array elements: ");
//        for (int num : array) {
//            System.out.print(num + " ");
//        }
//        System.out.println(); // Move to the next line
//        
//        // Calculate the sum of array elements
//        int sum = 0;
//        for (int num : array) {
//            sum += num;
//        }
//        
//        System.out.println("Sum of array elements: " + sum);
//    }
//}
//

//3.	Calculate factorial value of a number.

//import java.util.Scanner;
//
//public class LastPractice {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number to calculate its factorial: ");
//        int number = scanner.nextInt();
//        
//        long factorial = calculateFactorial(number);
//        
//        System.out.println("Factorial of " + number + " is: " + factorial);
//        
//        scanner.close();
//    }
//    
//    static long calculateFactorial(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        } else {
//            return n * calculateFactorial(n - 1);
//        }
//    }
//}

LastPractice