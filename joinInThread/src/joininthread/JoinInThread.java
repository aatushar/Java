
package joininthread;


public class JoinInThread {

    
    public static void main(String[] args) {
        Thread thread4 = new Thread(
        new PrintChar('C', 40));
        
        try{
            for( int i =1; i<=lastNum; i++){
                System.out.println(""+ i);
                if(i==50) thread4.join();
            }
    }
        catch(InterruptedException ex){
            
        }
    
}
`                