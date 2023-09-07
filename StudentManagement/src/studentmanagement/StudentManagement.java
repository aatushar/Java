
package studentmanagement;

import Info.Student;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Arrays;


public class StudentManagement {

    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Student student=new Student();
        
        Student[] students={
            
            new Student("Hasan",20),
            new Student("Limon",21),
            new Student("Rajib",22),
            new Student("Mamun",23),
        };
     
        
        
        
        FileOutputStream fileOutputStream=new FileOutputStream("Student.dat");
        ObjectOutput objectOutput=new ObjectOutputStream(fileOutputStream);
        
        objectOutput.writeObject(students);
       
        
        
        FileInputStream fileInputStream=new FileInputStream("Student.dat");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        
        Student[]  newStudents= (Student[]) objectInputStream.readObject();
        
        System.out.println(Arrays.toString(newStudents));
      
        
    }
    
}
