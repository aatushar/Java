package BinaryIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class binary {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("C:\\Users\\user\\Desktop\\bihanry.dat");
        FileOutputStream OutStream = new FileOutputStream(file);
        DataOutputStream outStream = new DataOutputStream(OutStream);

        for (int i = 1; i < 50; i++) {
//            OutStream.write(i);
                DataInputStream
        }
        FileInputStream inputStream = new FileInputStream(file);
        DataInputStream dataInputStream = new DataInputStream(inputStream);

        for (int i = 1; i < 50; i++) {
            System.out.println(inputStream.read());
        }
    }

}
