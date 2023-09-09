
package genericbysabitvsi;




public class GenericBySabitVsi {

    
    public static void main(String[] args) {
        GenricTest<String> generic = new GenricTest("5", "Tushar", "Mirpur");
        
        generic.test();
        
        System.out.println(generic.getId());
        generic.setId("8");
        generic.test();
    }
    
}
