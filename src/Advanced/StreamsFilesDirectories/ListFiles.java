package Advanced.StreamsFilesDirectories;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ListFiles {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\georgi.georgiev\\IdeaProjects\\SoftUniBasicJava\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");
        boolean isExisting = file.exists();

        long length = file.length();

        boolean isDirectory = file.isDirectory();

        File[] files = file.listFiles();

        for (int i = 0; i < files.length; i++) {
            if (!files[i].isDirectory()) {
                System.out.println(files[i].getName() + ": [" + files[i].length() + "]");
            }
        }
        System.out.println();
    }
}
