package Advanced.StreamsFilesDirectories;

import java.io.FileInputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        String inputFile = System.getProperty("user.dir") +"\\Files\\input.txt";

        FileInputStream fileData = new FileInputStream(inputFile);

        int value = fileData.read();

        while (value != -1) {
            if (value != 10 && value != 32) {
                System.out.print(value);
            } else {
                System.out.print((char) value);
            }
                value = fileData.read();
        }

    }
}
