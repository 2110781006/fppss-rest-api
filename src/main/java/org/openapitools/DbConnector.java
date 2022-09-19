package org.openapitools;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DbConnector
{
    private String username;
    private String password;

    private MysqlDataSource dataSource;

    public DbConnector(String username, String password)
    {
        this.username = username;
        this.password = password;

        dataSource = new MysqlDataSource();

    }

    public void open() throws SQLException
    {
        dataSource.setUser(username);
        dataSource.setPassword(password);
        dataSource.setServerName("localhost");
        dataSource.setDatabaseName("fppss-energy");
    }

    public Connection getConnection() throws SQLException
    {
        return dataSource.getConnection();
    }

    public void close() throws SQLException
    {
        if ( !dataSource.getConnection().isClosed() )
            dataSource.getConnection().close();
    }
}
