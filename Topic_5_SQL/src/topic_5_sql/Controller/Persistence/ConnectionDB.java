package topic_5_sql.Controller.Persistence;

import java.io.Closeable;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Federico
 */
public class ConnectionDB {

    private Connection connect = null;
   
    public Connection AccederBD() {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/high_school?" + "user=root&password=123456");

            if (connect != null) {
                JOptionPane.showMessageDialog(null, "Ok Base de datos listo");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        } catch (ClassNotFoundException e) {
           
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return connect;

    }

    public void cerracon() {
        try {

            connect.close();

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //This method is for sepond the topic 5
    

    

}
