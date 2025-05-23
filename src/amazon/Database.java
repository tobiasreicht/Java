package amazon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Database {
    private static final  String url = "jdbc:sqlserver://localhost:1433;databaseName=AmazonShop;encrypt=true;trustServerCertificate=true";
    ;
    private static final String USER = "REICHT\reich";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, USER, PASSWORD);
    }
}
