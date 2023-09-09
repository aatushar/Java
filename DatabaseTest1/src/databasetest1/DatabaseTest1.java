
package databasetest1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class DatabaseTest1 {

   
    public static void main(String[] args) {
        Connection connection=null;
        
        try {
            String url="jdbc:mysql://localhost:3306/tushardb";
            String username="root";
            String password="eamubino";
            
          connection =DriverManager.getConnection(url, username, password);
          
          String insertQuery="INSERT INTO dbtest (ID,Student_Name,Address)   VALUES (?,?,?)";
          int ID=2;
          String Student_Name="Tushar";
          String Address="Mirpur 1, Dhaka";
          
            try (PreparedStatement preparedStatment=connection.prepareStatement(insertQuery)){
                
                preparedStatment.setInt(1, ID);
                preparedStatment.setString(2, Student_Name);
                preparedStatment.setString(3, Address);
                
                int rowAffected=preparedStatment.executeUpdate();
                System.out.println(rowAffected+" row(s) inserted");
            } catch (Exception e) {
            }
          
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(connection !=null){
                try {
                    connection.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
}
