
package recurtionfactorial;

import java.util.Scanner;


public class RecurtionFactorial {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pls entre a number");
        int sum= input.nextInt();
        
       System.out.println("The sum of :"+ sum +"  is " + factorial(sum));
    }
    public static double factorial(int sum){
        

        if (sum==1){
        return 1;
        }
        else{
        return sum * factorial(sum-1);}
        
    }
    
}

