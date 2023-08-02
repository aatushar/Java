
package arrayinitializer1;

import java.util.Arrays;
import java.util.Scanner;


public class ArrayInitializer1 {

    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       String[]  subjects={"JEE","CSS","HTML","Javascript","JSP","DDD"};
        System.out.println(Arrays.toString(subjects));
        
        
        
//         int []marks=new int[10];
//       marks[0]=0;
//       marks[1]=0;
//       marks[2]=0;
//       marks[3]=0;
//       marks[4]=0;
//       marks[5]=0;
//       marks[6]=0;
//       marks[7]=0;
//       marks[8]=0;
//       marks[9]=0;
//       
//       for(int i=0; i<marks.length; i++){
//           System.out.println(Math.random()*10);
       
//       }


//        Max and Min

        System.out.println("Enter your Array Size");
        int size=sc.nextInt();
        int[]numbers=new int[size];
        
        int sum=0;
        int max=0;
         int min=99999999;
     
        
        
        for(int i=0;i<numbers.length;i++){
        numbers[i]=(int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(numbers));

          for(int number:numbers){
              sum+=number;
              if(number>max){
              max=number;
              
              }
              else if(number<min){
              min=number;
              }

                max=number>max ?number:max;
                min=number<min ? number:min;
//              System.out.println(number);
          }
         
          System.out.println("Sum is "+sum);
          System.out.println("Avg is "+sum/numbers.length);
          System.out.println("Max is "+max);
          System.out.println("Min is "+min);
          
//           Alternate 
//         int max=numbers[0];
//         int min=numbers[0];
//         
//         
//         for(int number:numbers){
//               max=number>max ? number:max;
//              
//               min=number<min ? number:min;
//         
//         }
//         System.out.println("Max is "+max);
//          System.out.println("Min is "+min);
         
          
    }
    
    
}
