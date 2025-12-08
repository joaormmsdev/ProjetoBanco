package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import entities.Comment;
import entities.Post;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss") ;

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome");

        Post p1 = new Post(
            sdf.parse("21/06/2018 13:05:44"),
            "Traveling to new Zeland",
            "I'm to visit this wonderfull contry",
            12);

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);

        Comment c3 = new Comment("Have a nice trip!");
        Comment c4 = new Comment("Wow that's awesome");

        Post p2 = new Post(
        sdf.parse("21/06/2018 13:05:44"),
        "Traveling to new Zeland",
        "I'm to visit this wonderfull contry",
        12);

        p1.addComment(c3);
        p1.addComment(c4);


        
        System.out.println(p2);
        }
    }

