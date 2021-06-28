package Fundamentals.Objects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String articleData = scan.nextLine();
        String[] splitData = articleData.split(", ");
        String title = splitData[0];
        String content = splitData[1];
        String author = splitData[2];

        Article myArticle = new Article(title, content, author);



    }

}
