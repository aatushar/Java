
package javaclass8;

import java.util.Scanner;


public class JavaClass8 {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
//     1   Max number
//        System.out.println("Pls enrer first number");
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

// 2 Min number
//        max & min number
//        System.out.println("Enter itme number ");
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

// 3 average
//     System.out.println("Enter itme number ");
//        int n = input.nextInt();
//   int max = 0, min =999999999;
//   int inputNumber;
//   int sum= 0;
//   int avgNumber =n;
//   
//   
//   
//   while (n>0){
//       System.out.println("enter number ");
//       inputNumber = input.nextInt();
//       sum+=n;
//       if(max < inputNumber){
//           max= inputNumber;
//       }
//       if (min >inputNumber) {
//           min =inputNumber;
//       }
//       n--;
//   }
//   avgNumber=sum/avgNumber;
//        System.out.println("Maxnumber  "+max);
//        System.out.println("Minnumber  "+min);
//        System.out.println("averagenumber "+(double)avgNumber);

//4 prime number
//System.out.println("Enter a number");
//int userInput= input.nextInt();
//     int count =0;
//     for (int i=1; i<=userInput; i++){
//         if(userInput % i==0){
//             count +=1;
//         }
//     }
////     end the loop
//     if (count==2){
//         System.out.println("This is a prime number");
//     }
//     else {
//         System.out.println("This is not a prime number");
//     }
//     
//5. factorial number
   

//System.out.println("Enter  a number");
//int number = sc.nextInt();
// 
//for

       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
}
    }
    
}


