package org.example.SN.day11.s1;


import java.util.ArrayList;
import java.util.List;

public class s1 {
    public static void main(String[] args) {
        v4();
    }

    static void v4() {
        System.out.println("===v4===");

        List<Article> articles = new ArrayList<>();

        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());

        for (int i = 0; i < articles.size(); i++) {
            Article article = articles.get(i);
            System.out.println(article.id);
        }
    }

    static void v3() {
        System.out.println("===v3===");

        ArrayList<Article> articles = new ArrayList<Article>();

        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());

        for (int i = 0; i < articles.size(); i++) {
            Article article = articles.get(i);
            System.out.println(article.id);
        }
    }

    static void v2() {
        System.out.println("===v2===");

        ArrayList articles = new ArrayList();

        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());

        for (int i = 0; i < articles.size(); i++) {
            Article article = (Article) articles.get(i);
            System.out.println(article.id);
        }
    }

    static void v1() {
        System.out.println("===v1===");
        Article[] articles = new Article[100];
        articles[0] = new Article();
        articles[1] = new Article();
        articles[2] = new Article();

        System.out.println(articles[0].id);
        System.out.println(articles[1].id);
        System.out.println(articles[2].id);
    }
}

class Article {
    static int lastId;

    int id;
    String regDate;

    static {
        lastId = 0;
    }

    Article() {
        this(lastId + 1, "2024-12-12 12:12:12");
        lastId++;
        id = lastId;
    }

    Article(int id, String regDate) {
    }
}