package br.com.alura.bytebank;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection recoverConnection() {
        try{
            return createDataSource().getConnection();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private HikariDataSource createDataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:postgresql://localhost:5432/byte_bank");
        config.setUsername("postgres");
        config.setPassword("password");
        config.setMaximumPoolSize(10);

        return new HikariDataSource(config);
    }
}
