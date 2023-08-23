
package recursion; // Corrected package name to match the folder structure

public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static long factorial(int n) {
        if (n <= 1) { // Base case: factorial of 0 and 1 is 1
            return 1;
        }
        
        long result = n * factorial(n - 1);
        return result;
    } 
}

