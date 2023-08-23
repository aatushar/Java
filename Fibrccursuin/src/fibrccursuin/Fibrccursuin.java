
package fibrccursuin;


public class Fibrccursuin {

   
    public static void main(String[] args) {
       long result = fib(6);
        System.out.println(result);
        }
        public static int fib(int index){
            if(index==0){
                return 0;
            }
            else if(index==1){
                return 1;
            }
            else{
                System.out.println(fib(index-1)+fib(index-2));
                return fib(index-1) + fib(index-2);
            }
        }
}
    
    

