
package multydimentionalarray3;


public class twoDArray {
    public int doSum(int[][]myArray) {
    int total=0;
    for(int row=0; row<myArray.length; row++){
        for (int column =0; column<myArray[row].length; column++){
        total+=myArray[row][column];
    }
    }
    
    return total;
  }  
}
