package Src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
        private static final String URL = "jdbc:mysql://localhost:3306/ats_checker";
        private static final String USER = "root";
        private static final String PASSWORD = "Rahul";

        public static Connection connect() throws SQLException {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }
    }

