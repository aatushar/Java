
package atmmachine;

import java.util.Scanner;

public class AtmMachine {
    static double ballance=1000;

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your ballance is "+ballance);
        System.out.println("For Withdraw press W, For Deposit press D ");
        String choice =sc.next();
        double amount =0;
        
        if (choice.equalsIgnoreCase("W")){
            System.out.println("Pls enter Amount");
            amount = sc.nextDouble();
            double newBalance =Withdraw(amount);
            System.out.println("balance="+newBalance);
            
        }
        else if (choice.equalsIgnoreCase("D")){
            System.out.println("pls enter amount");
            amount = sc.nextDouble();
            double newBallance = Deposit(amount);
            System.out.println("ballance=" +newBallance);
        }
        else{
            System.out.println("wrong input");
        }
    }

        
        
          public static double Withdraw(double amount){
     
         ballance -=amount;
         return ballance;
     }
    
     public static double Deposit(double amount ){
     
         ballance +=amount;
         return ballance;
            
        
     
}
    
}
