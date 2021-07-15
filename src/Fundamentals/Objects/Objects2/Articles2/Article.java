package Fundamentals.Objects.Objects2.Articles2;

public class Article {

    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
    //Създаваме нов метод за промяна на Content на обекта
    public void edit (String newContent) {
        this.content = newContent;
    }
    //Създаваме нов метод за промяна на Автора на обекта
    public void changeAuthor(String newAuthor) {
        this.author = newAuthor;
    }
    //Създаваме нов метод за промяна на Заглавието на обекта
    public void rename(String newTitle) {
        this.title = newTitle;
    }

    //Ползвайки @Override, променяме toString() метода да работи както искаме ние.
@Override
    public String toString() {
        //Връща заглавието на обекта, съдържанието му и автора
    return this.title + " - " + this.content + " - " + this.author;
    }
}
