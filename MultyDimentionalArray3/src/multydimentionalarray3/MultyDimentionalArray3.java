
package multydimentionalarray3;

public class MultyDimentionalArray3 {

    public static void main(String[] args) {
       twoDArray tamim = new twoDArray();
       int[][]numbers={{1,2,3,8},{5,6,7,8}};
       int[][]marks={{10,20,30,80},{50,60,70,80}};
       
        System.out.println("Number is: "+tamim.doSum(numbers));
        System.out.println("Number is: "+tamim.doSum(marks));
        
        
    }
    
}
