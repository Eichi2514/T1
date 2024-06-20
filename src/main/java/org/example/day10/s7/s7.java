package org.example.day10.s7;

public class s7 {
    public static void main(String[] args) {
        Article article1 = new Article("dbrjsgur13", "134679zx");
        Article article2 = new Article("picon13", "123456789a");
        Article article3 = new Article("Eichi2514","794613qw");
        Article article4 = new Article("AR3372","1q2w3e4ras");
        Article article5 = new Article("DBJ1598","illhyhl2");
        System.out.println(" ");
        article1.PW();
        article2.ID();
        article3.ID();
        article4.PW();
        article5.ID();

        // int = 12,402
        // long = 10,366
    }
}

class Article {
    static int i_number;
    int o_number;
    String i_id;
    String i_pw;

//    Article() {
//        ++i_number;
//        o_number = i_number;
//        System.out.println(o_number);
//    }

    Article(String o_id, String o_pw) {
        this.i_id = o_id;
        this.i_pw = o_pw;
        ++i_number;
        o_number = i_number;
        System.out.println(o_number + " : (ID : " + i_id + ", " + "PW : " + i_pw + ")");
    }

    void ID() {
        System.out.println(o_number +"의 ID : "+i_id);
    }

    void PW() {
        System.out.println(o_number +"의 PW : "+i_pw);
    }
}