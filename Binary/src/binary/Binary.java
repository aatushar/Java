package binary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Binary {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("C:\\Users\\LENOVO\\Desktop\\binary.dat");
        FileOutputStream outputStrem = new FileOutputStream(file);

        for (int i = 0; i <= 50; i++) {
            outputStrem.write(i);
        }

        FileInputStream inputStrem = new FileInputStream(file);
        for (int i = 0; i <= 50; i++) {
            System.out.println(inputStrem.read());
        }

    }

}
