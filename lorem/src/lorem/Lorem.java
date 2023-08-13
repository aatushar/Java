package lorem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lorem {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\user\\Desktop\\lorem.txt");
        Scanner read = new Scanner(file);
//        PrintWriter pw = new PrintWriter(file);
        
        
       
        
       if (file.exists()) {
            String tenWords = "";
        int count = 0;
            while (read.hasNext()) {
                String word = read.next();
                tenWords +=word+" ";
                count++;
                if (count ==10 ) {

                    System.out.println(tenWords);
                    break;
//                    count=0;
//                    tenWords="";
                }
                
        }

    }
    }
}

