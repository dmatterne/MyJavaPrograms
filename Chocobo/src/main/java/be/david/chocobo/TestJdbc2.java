package be.david.chocobo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by stannisbaratheon on 22/06/16.
 */
public class TestJdbc2 {
    public static void main(String[] args) {

        for (Actor e: findAllActorsByMovieTitle("ANACONDA CONFESSIONS")) {
            System.out.println(e.toString());
        }
        ;
    }

    private static List<Actor> findAllActorsByMovieTitle(String title) {
        Logger f = LoggerFactory.getLogger(TestJdbc2.class);


        String sql = "SELECT a.FIRST_NAME,a.LAST_NAME FROM FILM f\n" +
                "INNER JOIN FILM_ACTOR fa ON f.FILM_ID = fa.FILM_ID\n" +
                "INNER JOIN ACTOR a ON a.ACTOR_ID = fa.ACTOR_ID\n" +
                "WHERE upper(f.TITLE) = ?";

        try (Connection d = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sakila?serverTimezone=CET&useSSL=false", "root", "root");
             PreparedStatement s = d.prepareStatement(sql)) {
            s.setString(1, title);
            ResultSet rs = s.executeQuery();
            System.out.println("Connection made");


            ArrayList<Actor> actors = new ArrayList<>();
            while (rs.next()) {
                Actor actor = new Actor(rs.getString("FIRST_NAME"), rs.getString("LAST_NAME"));
              //  f.info(actor.toString());
                actors.add(actor);

            }


            return actors;

            //int updatedRows = s.executeUpdate("INSERT INTO ACTOR(FIRST_NAME,LAST_NAME) VALUES ('David','Matterne')");


        } catch (SQLException e) {
            System.out.println();
            e.printStackTrace();
            return null;
        }
    }
}


