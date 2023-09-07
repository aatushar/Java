
package genericmethod;


public class GenericMethod {

    public static void main(String[] args) {
       TestG <Integer,String> obj =new TestG<Integer,String>(100, "Tushar");
       obj.getMethod();
       
       TestG<Boolean, Double> obj1= new TestG<Boolean,Double>(true, Math.PI);
       obj1.getMethod();
       
       TestG<Integer, String> obj3= new TestG<Integer, String>(200,"Sabit vai is the active boy in our class");
       obj3.getMethod();
    }
    
}
