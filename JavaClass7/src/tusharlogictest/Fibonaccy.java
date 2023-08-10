
package tusharlogictest;

import java.util.Scanner;


public class Fibonaccy {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter no of fibonaccy Series ");
        int n= input.nextInt();
        
        int n1=0, n2=1, sum=0;
        System.out.println(n1);
        System.out.println(n2);
        
        for(int i=3; i<=n; i++){
            
            sum = n1+n2;
            System.out.println(sum);
            n1=n2;
            n2=sum;
            
        }
    }
}
