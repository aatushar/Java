
package threadconcept;


public class ThreadConcept {

   
    public static void main(String[] args) {
       PrintNumber pn1 = new PrintNumber("A");
       PrintNumber pn2 = new PrintNumber("B");
       PrintNumber pn3 = new PrintNumber("C");
    
       
       Thread t1 = new Thread(pn1);
       Thread t2 = new Thread(pn2);
       Thread t3 = new Thread(pn3);
      
       
       t1.start();
       t2.start();
       t3.start();
   
       
       
    }
    
}
