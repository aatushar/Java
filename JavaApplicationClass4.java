
package javaapplicationclass4;

import java.util.Scanner;

public class JavaApplicationClass4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
////         It's show like a prompt
//        double amount = input.nextDouble();
////         it shows the first value
//        
//        int remainingAmount = (int)(amount * 100);
////        It's a multyply for count
//        int numberOfOneDollars = remainingAmount/100;
////        covert into sent
//        remainingAmount = remainingAmount % 100;     
//        
//        
//        int numberOfQuarters = remainingAmount / 25;
////        Quarters
//        remainingAmount = remainingAmount % 25;
//        
//        int numberOfDimes = remainingAmount /10;
//        remainingAmount = remainingAmount % 10;
//        
//        int numberOfNickels = remainingAmount /5;
//        remainingAmount = remainingAmount %5;
//        
//        int numberOfPennies = remainingAmount;
//        
//        
//        
//        System.out.println("Your amount" + amount +" Consists of" );
//        System.out.println(" " + numberOfOneDollars +" Dollars" );
//        System.out.println(" " + numberOfQuarters + " quarters ");
//         System.out.println(" " + numberOfDimes + " dimes ");
//         System.out.println(" " + numberOfNickels + " Nickels ");
//         System.out.println(" " + numberOfPennies + " pennies ");
        

//**2.6 (Sum the digits in an integer) Write a program that reads an integer between 0 and
//1000 and adds all the digits in the integer. For example, if an integer is 932, the
//sum of all its digits is 14.
//Hint: Use the % operator to extract digits, and use the / operator to remove the
//extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.


//      double number = input.nextDouble();
//        int remainingNumber;
//      
//       int numberOfamount = remainingNumber/10;
//       
//      numberOfamount = remainingNumber % 10;
//       
//      
//       
//
//
//        System.out.println("number");

        System.out.print("Input an integer between 0 and 1000: ");
        int num = input.nextInt();

        int firstDigit = num % 10;
        int remainingNumber = num / 10;
        int SecondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int fourthDigit = remainingNumber % 10;
        int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
        System.out.println("The sum of all digits in " + num + " is " + sum);

     



    }   
    
}
