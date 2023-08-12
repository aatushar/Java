import java.util.Scanner;

public class Qn1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        
        System.out.println("Enter a sequence of integers (enter a negative integer to stop):");
        
        while (true) {
            int num = scanner.nextInt();
            
            if (num < 0) {
                break;
            }
            
            sum += num;
        }
        
        System.out.println("Sum of positive integers entered: " + sum);
        
        scanner.close();
    }
}
