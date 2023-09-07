
package recurtionfibonacci;

import java.util.Scanner;


public class RecurtionFibonacci {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Entre any random number : ");
        int number = input.nextInt();
        
        for(int i =0; i<number; i++){
            System.out.println(fibonaci(i)+"");   
        }
    }
    public static int fibonaci(int k){
        if(k<=0){
            return 1;
        }
        else{
            return fibonaci(k-1)+fibonaci(k-2);
        }
    }
    
}
