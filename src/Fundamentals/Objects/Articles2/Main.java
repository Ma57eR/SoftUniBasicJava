package Fundamentals.Objects.Articles2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        String title = fullContent[0];
//        String content = fullContent[1];
//        String author = fullContent[2];

        //Article article = new Article(fullContent[0], fullContent[1], fullContent[2]);
        int numEdits = Integer.parseInt(scan.nextLine());
        List<Article> articleList = new ArrayList<>();
        for (int edit = 1; edit <= numEdits; edit++) {
            String[] fullContent = scan.nextLine().split(", ");
            Article article = new Article(fullContent[0], fullContent[1], fullContent[2]);
            articleList.add(article);
        }
        String type = scan.nextLine();

        if (type.equals("title")) {
            articleList.sort(Comparator.comparing(Article::getTitle));
        } else if (type.equals("content")) {
            articleList.sort(Comparator.comparing(Article::getContent));
        } else if (type.equals("author")) {
            articleList.sort(Comparator.comparing(Article::getAuthor));
        }
        for (int article = 1; article <= articleList.size() ; article++) {
            System.out.println(articleList.get(article-1).toString());
        }
    }


}
