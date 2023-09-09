
package databaseconecttest;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utill.DbConect;




public class DatabaseConectTest {

   
    public static void main(String[] args) {
       
        DbConect con = new DbConect();
        String sql= "insert into tushar1(Student_ID, Address, contract) values(?,?,?)";
        
        try {
            PreparedStatement ps=con.getCon().prepareStatement(sql);
            ps.setInt(1, 3);
            ps.setString(2, "Sabit");
            ps.setString(3, "0178269110");
            
             ps.executeUpdate();
             System.out.println("ok");
                    
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConectTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
