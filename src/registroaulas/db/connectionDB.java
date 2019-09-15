package registroaulas.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author joseluiz
 */
public class connectionDB {

    Connection conn = null;
    private static Connection connection = null;

    public static Connection conexaoBD() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:" + System.getProperty("user.home") + "/db_aula.sqlite");
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public static void setConnection(String path) {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(connectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:" + path);
            System.out.println("Este direotrio: " + path);
        } catch (SQLException ex) {
            Logger.getLogger(connectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        connectionDB.connection = conn;
    }
}
