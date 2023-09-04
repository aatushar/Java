
package evdqn1;

import java.util.Arrays;
import java.util.Scanner;


public class EvdQn1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray = new int[100];
        
        for (int i=0; i<myArray.length; i++)
            myArray[i]=(int)(Math.random()*100);
        
        System.out.println(Arrays.toString(myArray));
        
        System.out.println("Pls enter index serial:");
        int userInput =input.nextInt();
        
        try{
            int value=myArray[userInput];
            System.out.println("Your value is "+value);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    
}
