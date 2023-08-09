package pratice.pkgfor.exam;

import java.util.Scanner;

public class PraticeForExam {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.println("Entre the first number");
//        int number1= input.nextInt();
//        
//        System.out.println("Entre the second number");
//        int number2 = input.nextInt();
//        
//        System.out.println("Entre the third number");
//        int number3 = input.nextInt();
//        
//        
//        int maxNumber=0, minNumber=0;
//         if (number1>number2 && number1>number3){
//             maxNumber= number1;
//            } 
//             else if (number2>number1 && number2>number3){
//                     maxNumber= number2;
//        }
//             else {maxNumber=number3;
//    
//    }
//         System.out.println("Maxnumber is = "+maxNumber);
//        System.out.println("Entre the first number");
//        int n1= input.nextInt();
//        
//        System.out.println("Entre the second number");
//        int n2= input.nextInt();
//        
//        System.out.println("entre the third number");
//        int n3= input.nextInt();
//        
//        System.out.println("Entre the forth number");
//        int n4 = input.nextInt();
//int maxNumber=0, minNumber = 0;
//if(n1>n2 && n2>n3 && n3>n4){
//    maxNumber=n4;
// }   
//    else if(n1>n2 && n2>n3 && n4>n3){
//            maxNumber=n3; }
//
//    else if (n2>n1 && n2>n3 && n3>n4){
//        maxNumber=n2;
//    }
//    else{maxNumber=n4;
//    
//    }
//        System.out.println("The max number is "+maxNumber);
//  System.out.println("Pls enrer first number");
//        int number1= input.nextInt();
//        System.out.println("Pls enrer second number");
//        int number2= input.nextInt();
//        System.out.println("Pls enrer third number");
//        int number3= input.nextInt();
//        
//        int maxNumber=0, minNumber=0;
//        if (number1>number2 && number2>number3){
//            maxNumber=number3;
//        }
//        else if (number2 >number1 && number2>number3){
//        maxNumber=number2;
//        
//    }
//        else {maxNumber= number3;
//        
//    }
//        System.out.println("Max number= "+maxNumber);
//
//     System.out.println("Enter itme number ");
//        int n = input.nextInt();
//   int max = 0, min =999999999;
//   int inputNumber;
//   
//   while (n>0){
//       System.out.println("enter number ");
//       inputNumber = input.nextInt();
//       if(max < inputNumber){
//           max= inputNumber;
//       }
//       if (min >inputNumber) {
//           min =inputNumber;
//       }
//       n--;
//   }
//        System.out.println("Maxnumber  "+max);
//        System.out.println("Minnumber  "+min);
//
//
//        System.out.println("Entre item number");
//        int n =input.nextInt();
//        int max =0, min=999999999;
//        int inputNumber;
//        
//        while(n>0) {
//            System.out.println("Entre Number");
//            inputNumber= input.nextInt();
//            if (max<inputNumber){
//                max=inputNumber;
//            }
//            if (min>inputNumber){
//                min=inputNumber;
//            }
//            n--;
//        }
//            
//        System.out.println("the max number is"+max);
//        System.out.println("the min number is"+min);
//        System.out.println("Entre itmes of number");
//        int n= input.nextInt();
//        int max =0, min=99999999;
//        int inputNumber;
//
//    while (n>0){
//        System.out.println("entre number");
//        inputNumber= input.nextInt();
//    
//    if(max<inputNumber){
//       max=inputNumber;
//   }
//    if (min>inputNumber){
//        min=inputNumber;
//    }
//    n--;
//    
//
//
//
//    } 
//        System.out.println("show the max number is "+max);
//        System.out.println("show the min number is "+min);
//       
//        System.out.println("Enter the number of items: ");
//        int n = input.nextInt();
//        int max = Integer.MIN_VALUE; // Initialize max with the smallest possible integer value
//        int min = Integer.MAX_VALUE; // Initialize min with the largest possible integer value
//        int inputNumber;
//        int sum = 0;
//
//        // While loop to read n numbers and find sum, max, and min
//        for (int i = 0; i < n; i++) {
//            System.out.println("Enter number " + (i + 1) + ": ");
//            inputNumber = input.nextInt();
//            sum += inputNumber;
//
//            if (max < inputNumber) {
//                max = inputNumber;
//            }
//            if (min > inputNumber) {
//                min = inputNumber;
//            }
//        }
//        input.close(); // Close the scanner after use
//
//        // Calculate the average
//        double avgNumber = (double) sum / n;
//
//        // Print the results
//        System.out.println("Max number: " + max);
//        System.out.println("Min number: " + min);
//        System.out.println("Average number: " + avgNumber);
        System.out.println("Entre a number");
        int userInput = input.nextInt();

        int count = 0;
        for (int i = 1; i <= userInput; i++) {
            if (userInput % i == 0) {
                count += 1;
            }
        }

        if (count == 2) {
            System.out.println("this is a prime number");

        } else {
            System.out.println("This is not prime number");
        }

    }
}
