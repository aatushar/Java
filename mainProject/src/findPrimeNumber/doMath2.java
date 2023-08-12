
package findPrimeNumber;


public class doMath2 {
    public String primeNumber(int num){
        int count=0;
        
        for (int  i=1; i<=num; i++){
        if (num%i==0){
            count+=1;
        }
    }
        if(count==2){
            return "Its a prime number";
            
        }
        else {
            return "Its not a prime number";
    }
    }
}
