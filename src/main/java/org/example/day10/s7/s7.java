package org.example.day10.s7;

public class s7 {
    public static void main(String[] args) {
        Article[] articles = new Article[10];
        articles[0] = new Article("1ID", "1PW");
        articles[1] = new Article("2ID", "2PW");
        articles[2] = new Article("3ID","3PW");
        articles[3] = new Article("4ID","4PW");
        articles[4] = new Article("5ID","5PW");
        articles[5] = new Article();
        articles[6] = new Article();
        articles[7] = new Article();
        articles[8] = new Article();

        System.out.println(" ");

        articles[0].PW();
        articles[1].PW();
        articles[2].ID();
        articles[3].PW();
        articles[4].ID();
        articles[5].ID();

        // int = 12,402
        // long = 10,366
    }
}

class Article {
    static int i_number = 1;
    int o_number;
    String i_id;
    String i_pw;

    Article() {
        o_number = i_number;
        System.out.println(o_number);
        i_number++;
    }

    Article(String o_id, String o_pw) {
        this.i_id = o_id;
        this.i_pw = o_pw;
        o_number = i_number;
        System.out.println(o_number + " : (ID : " + i_id + ", " + "PW : " + i_pw + ")");
        i_number++;
    }

    void ID() {
        System.out.println("articles " + o_number +"번방의 ID : "+i_id);
    }

    void PW() {
        System.out.println("articles " + o_number +"번방의 PW : "+i_pw);
    }
}