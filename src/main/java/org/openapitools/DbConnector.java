package org.openapitools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector
{
    private String username;
    private String password;
    private String url;

    private Connection connection;

    public DbConnector(String url, String username, String password)
    {
        this.username = username;
        this.password = password;
        this.url = url;
    }

    public void open() throws SQLException
    {
        connection = DriverManager.getConnection(url,username,password);
    }

    public Connection getConnection() throws SQLException
    {
        return connection;
    }

    public void close() throws SQLException
    {
        if ( !connection.isClosed() )
            connection.close();
    }
}
