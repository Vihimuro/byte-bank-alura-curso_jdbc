package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    public static void main(String... x) {

        try{
            Connection connection = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/byte_bank?user=postgres&password=password");
            System.out.println("Connected");
            connection.close();
        }
        catch (SQLException e) {
            System.out.println(e);
        }
    }
}
