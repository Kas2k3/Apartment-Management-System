package aparmentmanagementsystem;

import java.sql.*;


public class database {

    public static Connection connectDb() {
        try {
            String username = "admin";
            String password = "123456";
            String url = "jdbc:sqlserver://KAS2003\\KAS:1433;databaseName=BlueMoon";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connect = DriverManager.getConnection(url, username, password);
            return connect;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}

