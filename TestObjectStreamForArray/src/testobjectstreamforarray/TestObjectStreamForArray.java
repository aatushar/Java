package testobjectstreamforarray;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class TestObjectStreamForArray {

    public static void main(String[] args, OutputStream FileOutputStream) throws IOException {
        int[] numbers = {10, 20, 30, 40, 50};
        String[] gret = {"Hello", "welcome", "Good", "Morning"};
        FileOutputStream fieoutOutputStream = new FileOutputStream("C:\\Users\\user\\Desktop\\test.dat");
        // OutputStream FileOutputStream = null;
        //OutputStream FileOutputStream = null;
                ObjectOutput objectOutput = new ObjectOutputStream(FileOutputStream)) {
            objectOutput.writeObject(numbers);
            objectOutput.writeObject(gret);
        
    }

}

//package testobjectstreamforarray;
//
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectOutputStream;
//import java.io.OutputStream;
    
//
//public class TestObjectStreamForArray {
//
//    public static void main(String[] args) throws IOException {
//        int[] numbers = {10, 20, 30, 40, 50};
//        String[] gret = {"Hello", "welcome", "Good", "Morning"};
//
//        // Open a FileOutputStream to the desired file path
//        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\user\\Desktop\\test.dat");
//
//        // Wrap the FileOutputStream with an ObjectOutputStream
//        ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutputStream);
//
//        // Write the arrays to the ObjectOutputStream
//        objectOutput.writeObject(numbers);
//        objectOutput.writeObject(gret);
//
//        // Close the ObjectOutputStream
//        objectOutput.close();
//
//        System.out.println("Arrays written to file successfully.");
//    }
//}
