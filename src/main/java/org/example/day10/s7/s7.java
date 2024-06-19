package org.example.day10.s7;

public class s7 {
    public static void main(String[] args) {
        Article article1 = new Article();
        Article article2 = new Article();
        Article article3 = new Article();
        Article article4 = new Article();
        Article article5 = new Article();

        // int = 12,402
        // long = 10,366
    }
}
class Article{
    static int ListId;
    int id;
    String regDate;

    Article(){
        this.id = ++ListId;
        System.out.println(this.id);
    }
    Article(int id, String regDate){
        this.id = id;
        this.regDate = regDate;
    }
}