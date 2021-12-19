package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    public static Connection getMySQLConnection() throws SQLException,
            ClassNotFoundException {
        String hostName = "localhost";

        String dbName = "mytestdb";
        String userName = "root";
        String password = "postgres";

        return getMySQLConnection(hostName, dbName, userName, password);
    }

    public static Connection getMySQLConnection(String hostName, String dbName,
                                                String userName, String password) throws SQLException {

        String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName + "?useSSL=false&requireSSL=false&autoReconnect=true";
        Connection conn = DriverManager.getConnection(connectionURL, userName,
                password);
        return conn;
    }
}
