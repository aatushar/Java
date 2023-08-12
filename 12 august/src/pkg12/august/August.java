
package pkg12.august;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class August {

   
    public static void main(String[] args)throws FileNotFoundException {
        File file = new File("C:\\Users\\user\\Desktop\\tushar.txt");
        Scanner read = new Scanner(file);
        PrintWriter pw= new PrintWriter(file);
        
        System.out.println("Does it exist?" + file.exists());
        pw.println("Hello Java");
        pw.close();
        
        if(file.length()>0){
            System.out.println(read.nextLine());
            
        }
        else{System.out.println("File is empty");
        }
        read.close();
 
    }
    
}
