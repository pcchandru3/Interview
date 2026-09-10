package com.pcn.interview.Singleton;

import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import com.zaxxer.hikari.HikariConfig;


public enum SingletonDBConnectionEnumSQL {
    
    INSTANCE;
    
    private final HikariDataSource datasource;


    // Private Constructor
    private SingletonDBConnectionEnumSQL() {
        HikariConfig config = new HikariConfig();
        
        config.setJdbcUrl("jdbc:postgresql://localhost:5432/yourdatabase");
        config.setUsername("user");
        config.setPassword("pass");

        config.setMaximumPoolSize(10);
        config.setMinimumIdle(5);
        config.setIdleTimeout(300000);
        config.setConnectionTimeout(20000);

        this.datasource = new HikariDataSource(config);
    }


    // Public Static method
    public Connection getInstance() throws SQLException {
        return datasource.getConnection();
    }

    public void executeQuery(String sql) {
        System.out.println("Executing Query : " + sql);
    }

}


