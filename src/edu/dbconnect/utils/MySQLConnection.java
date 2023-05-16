package edu.dbconnect.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

public class MySQLConnection {

    private static final String URL = "jdbc:mariadb://localhost:3306/java_dbconnect";
    private static final String USR = "root";
    private static final String PWD = "";
    private Connection connection;
    private static MySQLConnection instance;


    public Connection getConnection() {
        return connection;
    }
    public static synchronized MySQLConnection getInstance() {
        if (Objects.isNull(instance)) {
            instance = new MySQLConnection();
        }
        return instance;
    }

    private MySQLConnection() {
        try {
            connection = DriverManager.getConnection(URL, USR, PWD);
            System.out.println("Connexion etablie...");
        } catch (SQLException ex) {
            System.out.println("Erreur de connection: " + ex.getMessage());
        }
    }
}
