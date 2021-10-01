package Advanced.StreamsFilesDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class writeToFile {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String inputFile = System.getProperty("user.dir") +"\\Files\\input.txt";
        String outputFile = System.getProperty("user.dir") +"\\Files\\output.txt";
        //System.out.println();
        FileInputStream fileData = new FileInputStream(inputFile);
        FileOutputStream output = new FileOutputStream(outputFile);
        int value = fileData.read();
        List<Character> punctuations = new LinkedList<>();
        Collections.addAll(punctuations, ',', '.', '!', '?');

        while (value != -1) {
            int currentChar = (char) value;

            if ((!punctuations.contains((char) value))) {
                System.out.print((char) currentChar);
                output.write((char)value);
            }


            value = fileData.read();
        }


    }
}
