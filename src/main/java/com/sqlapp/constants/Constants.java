package com.sqlapp.constants;

public class Constants {
    public static final String url = "jdbc:mysql://localhost:3306/";
    public static final String userName = "root";
    public static final String password = "12345";
    public static final String SHOW_DATABASES = "show databases;";
    public static final String USE_DATABASE = "use %1$s;";
    public static final String SHOW_TABLES = "show tables;";
    public static final String DESC_TABLE = "desc %1$s;";
    public static final String SELECT_TABLE = "Select * from %1$s;";
    public static final String DROP_TABLE = "Drop Table %1$s;";
    public static final String CREATE_DATABASE = "Create Database %1$s;";
    public static final String DROP_DATABASE = "Drop Database %1$s;";
    public static final String UPDATE_COLUMN = "UPDATE %1$s SET %2$s = ";
    public static final String DELETE_ROW = "DELETE from %1$s WHERE ";
}
