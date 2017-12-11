

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class databaseTest {
        // The JDBC Connector Class.
        private static final String dbClassName = "org.mariadb.jdbc.Driver";
        // Connection string. emotherearth is the database the program
        // is connecting to. You can include user and password after this
        // by adding (say) ?user=paulr&password=paulr. Not recommended!
        private static final String CONNECTION =
                "jdbc:mariadb://45.33.99.225:9527/storet";
        public static void main(String[] args) throws
                ClassNotFoundException,SQLException
        {
            System.out.println(dbClassName);
            // Class.forName(xxx) loads the jdbc classes and
            // creates a drivermanager class factory
            Class.forName(dbClassName);
            // Properties for user and password. Here the user and password are both 'paulr'
            Properties p = new Properties();
            p.put("user","dbuser");
            p.put("password","User@12345");
            // Now try to connect
            Connection c = DriverManager.getConnection(CONNECTION,p);
            System.out.println("It works !");
            c.close();
        }
}
