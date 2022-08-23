package ModeloGUI; /***
 * Tutorial: https://www.codejava.net/java-se/jdbc/connect-to-microsoft-sql-server-via-jdbc
 *https://medium.com/@navdeepsinghbedi/setting-up-ms-sql-server-on-docker-and-intellij-2c0a803e41c1#:~:text=Connecting%20the%20SQL%20Server%20to,see%20the%20SQL%20Server%20image.
 */
import java.sql.*;

public class DBConnection {
    protected static String myDriver = "com.microsoft.jdbc.sqlserver.SQLServerDriver";
    protected static String myUrl = "jdbc:sqlserver://localhost:1433";
    protected static String user = "sa";
    protected static String password = "UniSex123Uni8";

    private Connection conn;

    public DBConnection(){

        try{
            conn = DriverManager.getConnection(myUrl,user,password);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        return this.conn;
    }


}

