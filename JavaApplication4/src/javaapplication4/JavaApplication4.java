
package javaapplication4;

import java.util.Scanner;


public class JavaApplication4 {

    
    public static void main(String[] args) {
      Scanner sc=new Scanner (System.in);
        System.out.println("Pls enter elements number");
        
        int n=sc.nextInt();
     int sum = 0;
     for (int i=1; i<=n; i++){
         int number =sc.nextInt();
       sum+=number;
    }
    System.out.println(sum);
 
    }
      
}




