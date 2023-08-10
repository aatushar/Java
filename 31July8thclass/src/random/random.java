
package random;

import java.util.Scanner;


public class DoWhileTest {
    
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        DoWhileTest dm=new DoWhileTest();
        
        
        System.out.println("Pls enter 1st number ");
        int n1=in.nextInt();
        
          System.out.println("Pls enter 1st number ");
        int n2=in.nextInt();
        
        
        System.out.println(dm.doSubtract(n1, n2));
    }
}
