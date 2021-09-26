package Advanced.StreamsFilesDirectories;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String path = "C:\\Users\\ggeor\\Downloads\\Advanced\\Streams and Files\\input.txt";

        //Отваряме стрийма заедно с пътна до файла
        FileInputStream fileStream = new FileInputStream(path);
        //Четем ASCII стойностите на всеки символ
        int readByte = fileStream.read();

            while (readByte != -1) {
                //Обръщаме ASCII към бинарен код
                System.out.print(Integer.toBinaryString(readByte) + " ");
                readByte = fileStream.read();
        }
    }
}
