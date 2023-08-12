
package class10;

import java.util.Arrays;


public class Class10 {

 
    public static void main(String[] args) {
        String[] studentNames= new String[10];
        studentNames[0]= "Rajib";
        studentNames[1]= "Limon";
        studentNames[2]= "Tushar";
        studentNames[3]= "Pranto";
        studentNames[4]= "Sabit";
        studentNames[5]= "Tushar";
        studentNames[6]= "Tushar";
        studentNames[7]= "Tushar";
        studentNames[8]= "Tushar";
        studentNames[9]= "Tushar";
        
        int[] marks = new int[10];
        marks[0]=45;
        marks[1]=50;
        marks[2]=30;
        marks[3]=35;
        marks[4]=20;
        marks[5]=10;
        marks[6]=25;
        marks[7]=35;
        marks[8]=48;
        
//        System.out.println(studentNames); --its computer language (object
        
        System.out.println(Arrays.toString(studentNames));
        System.out.println(Arrays.toString(marks));
        
        
        for (int i=0; i<marks.length; i++){
            System.out.println("Student name is "+studentNames[i]+" and marks is " +marks[i] );
        }
    
    } 
}
