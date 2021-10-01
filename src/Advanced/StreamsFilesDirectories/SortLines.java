package Advanced.StreamsFilesDirectories;

import java.awt.image.ImagingOpException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class SortLines {
    public static void main(String[] args) throws ImagingOpException, IOException {

        Path in = Paths.get("C:\\Users\\georgi.georgiev\\IdeaProjects\\SoftUniBasicJava\\input.txt");
        Path out = Paths.get("C:\\Users\\georgi.georgiev\\IdeaProjects\\SoftUniBasicJava\\sortedLines.txt");
        List<String> fileLines = Files.readAllLines(in);
        Collections.sort(fileLines);
        //fileLines.stream().forEach(System.out::println);
        Files.write(out, fileLines);
    }
}
