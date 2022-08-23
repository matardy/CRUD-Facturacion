/*
 * Tutorial: https://www.codejava.net/java-se/jdbc/connect-to-microsoft-sql-server-via-jdbc
 *https://medium.com/@navdeepsinghbedi/setting-up-ms-sql-server-on-docker-and-intellij-2c0a803e41c1#:~:text=Connecting%20the%20SQL%20Server%20to,see%20the%20SQL%20Server%20image.
 *
 */
import java.sql.*;

public class DBConnection {
    //conexion con autentificacion de windows
    //https://stackoverflow.com/questions/11707056/no-sqljdbc-auth-in-java-library-path
    //hacer eso en el JRE y JDK
    protected static String Urlv2xd = "jdbc:sqlserver://localhost:1433;databaseName=Factura;integratedSecurity=true";

    private Connection conn;

    public DBConnection(){

        try{
            //conn = DriverManager.getConnection(myUrl,user,password);
            conn = DriverManager.getConnection(Urlv2xd);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        return this.conn;
    }


}

