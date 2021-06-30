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

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            String command = scan.nextLine();
            String commandType = command.split(": ")[0];
            String commandCont = command.split(": ")[1];
            switch (commandType) {
                case "Edit":
                    myArticle.edit(commandCont);
                    break;
                case "ChangeAuthor":
                    myArticle.changeAuthor(commandCont);
                    break;
                case "Rename":
                    myArticle.newTitle(commandCont);

                    break;
            }
        }
        System.out.println(myArticle.toString());

    }

}
