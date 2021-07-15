package Fundamentals.Objects.Objects2.Articles2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] token = scan.nextLine().split(", ");
        String title = token[0];
        String content = token[0];
        String author = token[0];
        int n = Integer.parseInt(scan.nextLine());
        //Създаваме нов обект от класа Article. Той има конструктор, в който се съдържат Title, Content, Author
        Article article = new Article(title, content, author);
        //За всяка команда
        for (int i = 0; i < n; i++) {
            String[] command = scan.nextLine().split(": ");
            //Взимаме самата команда
            switch (command[0]) {
                case "Edit":
                    //Извикваме метода в класа, който сме създали
                    article.edit(command[1]);
                    break;
                //Извикваме метода в класа, който сме създали
                case "ChangeAuthor":
                    //Извикваме метода в класа, който сме създали
                    article.changeAuthor(command[1]);
                    break;
                case "Rename":
                    //Извикваме метода в класа, който сме създали
                    article.rename(command[1]);
                    break;
            }
        }
        //Принтираме съдържанието на обекта
        System.out.printf(article.toString());


    }
}
