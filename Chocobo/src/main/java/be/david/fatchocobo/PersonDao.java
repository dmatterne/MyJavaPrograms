package be.david.fatchocobo;

import java.sql.*;

/**
 * Created by stannisbaratheon on 24/06/16.
 */
public interface PersonDao {

    Person findById(int id);


}

 class JdbcPersonDao implements PersonDao {
    public Person findById(int id) {
        try(Connection c = DriverManager.getConnection("","root","root")) {
            PreparedStatement ps = c.prepareStatement("select * from person where id = ?");
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            if (!rs.next()) {
                return null;
            } else {
                String fn = rs.getString("FIRST_NAME");
                String ln = rs.getString("LAST_NAME");
                return new Person(fn, ln, new java.util.Date(),null);
            }


        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

class Runner {
    public static void main(String[] args) {

        PersonDao dao = new StubPersonDao();
        loadPersonAndDoSomethingWithIt(dao);

   }

    private static void loadPersonAndDoSomethingWithIt(PersonDao dao) {
        Person p = dao.findById(1507);
        System.out.println(p.getFirstName());
        System.out.println(p.getLastName());
    }
}

class StubPersonDao implements PersonDao {
    @Override
    public Person findById(int id) {
        return new Person("Jimi", "Hendrix", new java.util.Date(),null);
    }
}