
package StudentManagement;

import Education.Student;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Question3 {

  
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
     
        Student student = new Student("Tushar",24);
        
        FileOutputStream fileOutputStream = new FileOutputStream("Student.dat");
        ObjectOutput objectOutput = new ObjectOutputStream(fileOutputStream);
       
        
        objectOutput.writeObject(student.name);
        objectOutput.writeObject(student.age);
        
        FileInputStream fileInputStrem = new FileInputStream("Student.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStrem);
        
        System.out.println(objectInputStream.readObject());
        System.out.println(objectInputStream.readObject());
        
        
    }
    
    
}
