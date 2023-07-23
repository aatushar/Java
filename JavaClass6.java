
package javaclass6;

import java.util.Scanner;

public class JavaClass6 {

    public static void main(String[] args) {
        Scanner Input =new Scanner(System.in);
        
////       char ch = '4';
//System.out.println("Hello java");

char ch= Input.next().charAt(0);

if(ch>'A' && ch<='Z'){
    System.out.println("Uppaer case");
}
else{
    System.out.println("Lower case");
}

        System.out.println("ch");
        
        
    }
    
}
