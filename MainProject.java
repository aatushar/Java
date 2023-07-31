
package mainproject;

import findPrimeNumber.doMath2;
import java.util.Scanner;

public class MainProject{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre your number");
        int num=sc.nextInt();
        
        doMath2 prime= new doMath2();
        System.out.println(prime.primeNumber(num));
    }
}