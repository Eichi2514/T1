package org.example.day10.s7;

public class s7 {
    public static void main(String[] args) {

        Article article1 = new Article();
        System.out.println(article1.id);

        Article article2 = new Article(1,"2024-12-12 12:12:12");
        System.out.println(article2.id);
    }
}
class Article{
    int id;
    String regDate;

    Article(){
        this.id = 1;
    }
    Article(int id, String regDate){
        this.id = id;
        this.regDate = regDate;
    }
}