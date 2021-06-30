package Fundamentals.Objects;

public class Article {
    //Описанието на една кола

    //Полета -> характеристики модел, цена, цвят, мощност  и т.н.

    private String title;
    private String content;
    private String author;



//Методи ->  какво може да прави всяка една кола

    public void edit (String newContent) {
        this.content = newContent;
    }

    public void changeAuthor (String newAuthor) {
        this.author = newAuthor;
    }

    public void newTitle (String titleNew) {
        this.title = titleNew;
    }

    //Конструктор
    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    @Override
    public String toString() {
        //Да опиша как изглежда моя обект като Стринг
        return this.title + " - " + this.content + ": " + this.author;
    }

}
