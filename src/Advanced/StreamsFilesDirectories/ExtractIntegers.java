package Advanced.StreamsFilesDirectories;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class ExtractIntegers  {
    public static void main(String[] args) throws IOException {
        String inputFile = System.getProperty("user.dir") +"\\Files\\input.txt";


        Scanner fileData = new Scanner(new FileInputStream(inputFile));



        while (fileData.hasNext()) {
            if (fileData.hasNextInt()) {
                System.out.println(fileData.nextInt());
            }
            fileData.next();

        }
    }
}
