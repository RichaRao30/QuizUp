
package quizup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Quizup {

    static String databaseURL = "jdbc:mysql://localhost:3306/quiz";
    static String user = "root";
    static String password = "sit123";
    
    static Connection conn;

    public static void main(String[] args) {
        Startup su=new Startup();
        su.setVisible(true);
    }
    
    static Connection getConn() throws SQLException{
        if(conn == null){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(databaseURL, user, password);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Quizup.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return conn;
    }
    
}
