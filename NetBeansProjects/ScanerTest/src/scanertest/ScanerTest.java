
package scanertest;

import java.util.Scanner;


public class ScanerTest {

  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
//        String grettings;
//        
//        System.out.println("Pls enter qrettings: ");
//        grettings=sc.nextLine();
//        
//        System.out.println(grettings+" java");
//    
// 2 int n1,n2;
//        System.out.println("Pls enter number 1");
//        
//        n1=sc.nextInt();
//        
//        System.out.println("Pls enter number 2");
//        n2=sc.nextInt();
//        
//        int result= n1+n2;
//        
// 
//System.out.println("The total of two number is "+result);

//1 to 10 number add 

//  int number, sum=0;
//for(int i=1; i<=10; i++){
//        System.out.println("Pls enter number "+1);
//        number=sc.nextInt();
//        sum+=number; 
////        (sum=sum+number)
//        
//        System.out.println("Total is "+sum);
//    }
//    } 
//}
//// Scanner is in the java.util package
//
// public class ComputeAreaWithConsoleInput {
//public static void main(String[] args) {
//// Create a Scanner object
//Scanner input = new Scanner(System.in);
//
// // Prompt the user to enter a radius
//System.out.print("Enter a number for radius: ");
// double radius = input.nextDouble();
//
// // Compute area
//double area = radius * radius * 3.14159;
//
// // Display results

    System.out.println("Enter a number for radius: ");
    double radius = sc.nextDouble();

    double area = radius * radius * 3.14159;

        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}