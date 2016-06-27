package be.david.chocobo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by stannisbaratheon on 22/06/16.
 */
public class TestJdbc {
    public static void main(String[] args) {

        for (Actor e : findAllActorsByMovieTitle("ANACONDA CONFESSIONS")) {
            System.out.println(e.toString());
        }
        ;
    }

    private static List<Actor> findAllActorsByMovieTitle(String title) {
        Logger f = LoggerFactory.getLogger(TestJdbc.class);


        String sql = "SELECT a.FIRST_NAME,a.LAST_NAME FROM FILM f\n" +
                "INNER JOIN FILM_ACTOR fa ON f.FILM_ID = fa.FILM_ID\n" +
                "INNER JOIN ACTOR a ON a.ACTOR_ID = fa.ACTOR_ID\n" +
                "WHERE upper(f.TITLE) = ?";

        try (DbConn d = new DbConn("jdbc:mysql://127.0.0.1:3306/sakila?serverTimezone=CET&useSSL=false", "root", "root",sql)) {
            d.setPrepStmtString(1, title);
            d.generateResultSet();

            System.out.println("Connection made");


            ArrayList<Actor> actors = new ArrayList<>();
            while (d.getRs().next()) {
                Actor actor = new Actor(d.getString("FIRST_NAME"), d.getString("LAST_NAME"));
                //f.info(actor.toString());
                actors.add(actor);
                //System.out.println(1 + "");

            }


            return actors;

            //int updatedRows = s.executeUpdate("INSERT INTO ACTOR(FIRST_NAME,LAST_NAME) VALUES ('David','Matterne')");


        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}


