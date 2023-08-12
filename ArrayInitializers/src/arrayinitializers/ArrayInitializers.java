
package arrayinitializers;

import java.util.Arrays;


public class ArrayInitializers {

  
    public static void main(String[] args) {
//       String[] subjects= {"jee","Html", "CSS", "Javascript", "jsp"};
//      double hours []= new double[10];
//      hours[0]= 45;
//      hours[1]= 51;
      
      
//        System.out.println(Arrays.toString(subjects));
//        System.out.println(Arrays.toString(hours));



//int sum=0;
//int max=0;
//int min=9999999;
int[] numbers =new int[10];
   
    
    for(int i=0; i<numbers.length; i++){
       numbers[i]=(int)(Math.random()*100);
        
    }
    int max=numbers[0];
    int min=numbers[0];
        
    for(int number:numbers){
        
//        
//         max=number>max ? number:max;
//         min=number<min ? number :min;
//        
//        
//    }  
    
int Max = 0;
for (int i = 1; i < numbers.length; i++) {
if (numbers[i] > max) {
max = numbers[i];

}}

        
    sum+=number;{
        if(number>max){
            max=number;
        }
    }
System.out.println(Arrays.toString(numbers));
        System.out.println("Max no is = " + max + " Min no is = "+min);
//        System.out.println(sum);
//        System.out.println(sum/numbers.length);
//        System.out.println("max is "+max);

//in this code where is max index situated show its serial number
    }
    
}
