

package exampratice2;

import java.util.Scanner;


public class ExamPratice2 {

 
    public static void main(String[] args) {
      
        Scanner input = new Scanner (System.in);
//        System.out.println("Pls enter your factorial number");
//        int input = sc.nextInt();
//        int forAssaign =1;
//        
//        for(int i =input;i>=1;i--){
//            forAssaign=forAssaign*i;
//        }
//        System.out.println("THe factorial of "+input +" is "+forAssaign);
        
//         int n1=0;
//        int n2=1,n3;
//        System.out.println(n1);
//        System.out.println(n2);
//        
//        for(int i=2;i<=7;i++){
//            
//           n3=n1+n2;
//           System.out.println(n3);
//            n1=n2;
//            n2=n3;
//        }
//        
//        System.out.println("Entre first number");
//        int number1= input.nextInt();
//        
//        System.out.println("Entre second number");
//        int number2= input.nextInt();
//        
//        System.out.println("Entre third number");
//        int number3= input.nextInt();
//        
//        int maxNumber=0, minNumber=0;
//        if(number1>number2 && number2>number3){
//            maxNumber= number3;
//            
//            
//        }
//        else if (number2>number1 && number2>number3){
//                    maxNumber= number2;
//                    }
//        else {
//            maxNumber=number3;
//     
//        }
//        
//        System.out.println("THe max number is "+maxNumber);
        
                Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int input1=sc.nextInt();
        System.out.println("Enter 2nd number");
        int input2=sc.nextInt();
        System.out.println("Enter 3rd number");
        int input3=sc.nextInt();
        
        
        if(input1>input2 && input1>input3){
            System.out.println("The maximum number is "+ input1);
        }
        else if(input2>input1 && input2>input3){
            System.out.println("The maximum number is "+ input2);
        }
        else{
            System.out.println("The maximum number is "+ input3);
        }
    }
    
}
