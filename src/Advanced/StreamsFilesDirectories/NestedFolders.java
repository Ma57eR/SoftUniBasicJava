package Advanced.StreamsFilesDirectories;

import java.awt.image.ImagingOpException;
import java.io.File;
import java.nio.file.Files;
import java.util.ArrayDeque;
import java.util.Deque;

public class NestedFolders {
    public static void main(String[] args) throws ImagingOpException {

        File root = new File("C:\\Users\\georgi.georgiev\\IdeaProjects\\SoftUniBasicJava\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        Deque<File> queue = new ArrayDeque<>();
        //Добавям най-горното ниво
        queue.offer(root);
        //Създавам списък с директориите и файловете
        File[] files = root.listFiles();
        int countFolders = 1;
        System.out.println(root.getName());
        while (!queue.isEmpty()) {
            File current = queue.poll();
            files = current.listFiles();
            //Проверка имаме ли файл
            if (files != null) {
                //Минаваме през всеки файл от списъка
                for (File file : files) {
                    if (file.isDirectory()) {
                        System.out.println(file.getName());
                        queue.offer(file);
                        countFolders++;
                    }
                }

            }
        }
        System.out.println(countFolders + " folders");
    }
}
