package Fundamentals.Objects;

public class Article {
    //Описанието на една кола

    //Полета -> характеристики модел, цена, цвят, мощност  и т.н.

    private String title;
    private String content;
    private String author;



    //Методи ->  какво може да прави всяка една кола


    //Конструктор
    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;

    }
}
