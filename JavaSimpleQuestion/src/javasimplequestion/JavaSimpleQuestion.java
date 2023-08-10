package javasimplequestion;

import java.util.Scanner;


public class JavaSimpleQuestion {

   
    public static void main(String[] args) {
        
//        Question 1
//        with for loop
//        int sum=0;
//        for(int i=1;i<=50;i++){
//            if(i!=7 && i!=15 && i!=23){
//              sum=sum+i;  
//            }
//            
//            
//        }
//        System.out.println("The sum is "+sum);

//with for loop
//      int sum=0;
//      int i=1;
//      while(i<=50){
//          
//          if( i!=7 && i!=15 && i!=23){
//              
//              sum=sum+i;
//             
//          }
//          i++;
//      }
//        System.out.println("The sum is "+ sum);
        
        



//        Question 2

//         Scanner sc=new Scanner(System.in);
//         int input =sc.nextInt();
//         int forAssainValue=1;
//         
//         for(int i=1;i<=10;i++){
//             forAssainValue=input*i;
//             System.out.println(input+" x "+i+" = "+forAssainValue);
//         }


//         Question 3

          Scanner sc=new Scanner(System.in);
          int input=sc.nextInt();
          
          for(int i=input+1;i<=input+5;i++){
              System.out.println("Next Five int number: "+ i);
          }


//          Question 4

//           Scanner sc=new Scanner(System.in);
//           System.out.println("Enter First Range");
//           int input1=sc.nextInt();
//           System.out.println("Enter Second Range");
//           int input2=sc.nextInt();
//           
//           for(int i=input1;i<=input2;i++){
//               int sum=0;
//               for(int j=1;j<=i;j++){
//                   if(i%j==0){
//                       sum=sum+1;
//                   }
//               }
//               if(sum==2){
//                   System.out.println(input1+" is a prime number");
//               }
//           }
            


//Without range
          
//           Scanner sc= new Scanner(System.in);
//           int input=sc.nextInt();
//           int sum=0;
//           
//           for(int i=1;i<=input;i++){
//               if(input%i==0){
//                   sum=sum+1;
//               }
//               
//           }
//           if(sum==2){
//               System.out.println(input+" is a prime number");
//           }
//           else{
//               System.out.println(input+" is not a prime number");
//           }


//     Question 5


//         Scanner sc=new Scanner(System.in);
//         System.out.println("Please enter your factorial number");
//         int input=sc.nextInt();
//         int forAssaign=1;
//         
//         for(int i=input;i>=1;i--){
//             forAssaign=forAssaign*i;
//         }
//         System.out.println("The factorial of "+ input+ " is "+forAssaign);



//      Question 6

//        int n1=0;
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
        
//        Question 7

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter 1st number");
//        int input1=sc.nextInt();
//        System.out.println("Enter 2nd number");
//        int input2=sc.nextInt();
//        System.out.println("Enter 3rd number");
//        int input3=sc.nextInt();
//        
//        
//        if(input1>input2 && input1>input3){
//            System.out.println("The maximum number is "+ input1);
//        }
//        else if(input2>input1 && input2>input3){
//            System.out.println("The maximum number is "+ input2);
//        }
//        else{
//            System.out.println("The maximum number is "+ input3);
//        }


//       Question 8

//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the X number");
//         int inputX=sc.nextInt();
//         System.out.println("Enter the n number");
//         int inputN=sc.nextInt();
//         
//         int result=inputX*inputN;
//         System.out.println("The value of the number is "+ result);



//        Question 9

//          Scanner sc=new Scanner(System.in);
//          System.out.println("How many times you want to sum");
//          int input=sc.nextInt();
//          int sum=0;
//          
//          for(int i=1;i<=input;i++){
//              System.out.println("Please Enter number "+i);
//              int input1=sc.nextInt();
//              sum=sum+input1;
//              
//          }
//          System.out.println("The sum of Total is "+ sum);


//         Question 10
            

//           Scanner sc=new Scanner(System.in);
//           System.out.println("Enter the price");
//           int price=sc.nextInt();
//           System.out.println("Enter the discount %(percentage)");
//           int discount=sc.nextInt();
//           
//           double topoint=(double)discount/100;
//           double finalPrice=price - (  (double) topoint* (double)price);
//           System.out.println("The final price is "+ (int)finalPrice);
    }
    
}