package Fundamentals.TextProcessing.Exercise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] fullPath = scan.nextLine().split("\\\\");
        String fullFileName = fullPath[fullPath.length - 1];
        String filename = fullFileName.split("\\.")[0];
        String extension = fullFileName.split("\\.")[1];

        System.out.println("File name: " + filename);
        System.out.println("File extension: " + extension);
    }
}
