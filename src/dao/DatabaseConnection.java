package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {
    private static final String path = System.getenv("DATABASE_URL");
    private static final String username = System.getenv("DATABASE_USER");
    private static final String password =System.getenv("DATABASE_PASSWORD");

    public static Connection connect() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(path,username,password);
        return conn;
    }
}