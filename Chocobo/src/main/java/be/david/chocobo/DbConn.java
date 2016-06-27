package be.david.chocobo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

/**
 * Created by stannisbaratheon on 22/06/16.
 */
public class DbConn implements AutoCloseable {
    private Connection d;
    private PreparedStatement s;

    private ResultSet rs;
    private int updatedRows;
    private Logger log = LoggerFactory.getLogger(DbConn.class);
    private String sql= "";

    public DbConn(String url, String username, String password,String sql) {
        try {
            this.sql = sql;
            d = DriverManager.getConnection(url, username, password);
            s = d.prepareStatement(sql);
            log.debug("Connected to DB.");
        } catch (SQLException e) {
            log.error("Connection failed.");
            e.printStackTrace();

        }
    }

    public void generateResultSet() {
        try {
            rs = this.s.executeQuery();
            log.debug("Executing prepared statement : " + this.sql);

        } catch (SQLException e1) {
            log.error("Failed to execute Query." + this.sql);
            e1.printStackTrace();
        }
    }

    public void setPrepStmtString(int id,String value){
        try {
            s.setString(id,value);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean nextResult() {
        try {
            return rs.next();
        } catch (SQLException e) {
            return false;
            //e.printStackTrace();
        }
    }

    public String getString(String column) {
        try {
            return rs.getString(column);
        } catch (SQLException e) {
            e.printStackTrace();
            return "";
        }

    }

    public int getInt(int column) {
        try {
            return rs.getInt(column);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }

    }

    public void updateResultSet(String sql) {
        try {
            updatedRows = s.executeUpdate(sql);
            log.debug("Updating database statement : " + sql);

        } catch (SQLException e1) {
            log.error("Failed to update database." + sql);
            e1.printStackTrace();
        }
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    @Override
    public void close()  {
        try {
            rs.close();
            s.close();
            d.close();
            log.debug("Closing connection succeeded.");
        } catch (SQLException e) {
            log.error("Failed to close connection");
            e.printStackTrace();
        } catch (Exception e ) {
            log.error("Failed to close connection due to general zxception");
            e.printStackTrace();
        }
    }
}
