package fileandtexthomework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileAndTextHomework {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\LENOVO\\Desktop\\loremt.txt");
        Scanner read = new Scanner(file);

        if (file.exists()) {
            String tenWords = "";
            int n = 0;
            while (read.hasNext()) {
                String words = read.next();
                tenWords += words + " ";
                n++;
               
                
                if(n==10){
                    System.out.println(tenWords);
                    n=0;
                    tenWords= " ";
                    
                }
//                System.out.println(tenWords);
            }

        }

    }

}
