
package multydimentionalarray2;

import java.awt.BorderLayout;
import java.util.Arrays;


public class MultyDimentionalarray2 {

    public static void main(String[] args) {
       int[][] matrix= {{10,20,30},{40,50,60},{70,80,90}};
       
        System.out.println(Arrays.deepToString(matrix));
        
        for(int row =0; row<3; row++){
            for(int column=0; column <3; column++){
                System.out.print(matrix[row][column] +" " );
            }
            System.out.println("");
        }
               
    }
    
}
