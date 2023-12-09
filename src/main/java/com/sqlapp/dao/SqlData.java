package com.sqlapp.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static com.sqlapp.constants.Constants.*;

public class SqlData {
    static Logger log = Logger.getLogger("SqlApp");

    public static List<String> getDatabases() {
        List<String> databases = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection(url, userName, password);
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery(SHOW_DATABASES);
            while (rs.next()) {
                String databaseName = rs.getString("Database");
                databases.add(databaseName);
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return databases;
    }

    public static List<String> getTablesInADatabase(String database) {
        List<String> tables = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection(url, userName, password);
            Statement stat = con.createStatement();
            String query = String.format(USE_DATABASE, database);
            stat.execute(query);
            ResultSet rs = stat.executeQuery(SHOW_TABLES);
            while (rs.next()) {
                String tableName = rs.getString("Tables_in_" + database);
                tables.add(tableName);
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tables;
    }

    public static List<String> getColumnNames(String database, String tableName) {
        List<String> columns = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection(url + database, userName, password);
            Statement stat = con.createStatement();
            String query = String.format(DESC_TABLE, tableName);
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) {
                columns.add(rs.getString("Field"));
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return columns;
    }

    public static List<List<String>> getDataFromTable(String database, String tableName, List<String> cols) {
        List<List<String>> rows = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection(url + database, userName, password);
            Statement stat = con.createStatement();
            String query = String.format(SELECT_TABLE, tableName);
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) {
                List<String> row = new ArrayList<>();
                for (String col : cols) row.add(rs.getString(col));
                rows.add(row);
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows;
    }

    public static String dropTable(String database, String tableName) {
        try {
            Connection con = DriverManager.getConnection(url + database, userName, password);
            Statement stat = con.createStatement();
            String query = String.format(DROP_TABLE, tableName);
            stat.execute(query);
            con.close();
        } catch (SQLException e) {
            return e.getLocalizedMessage();
        }
        return "";
    }

    public static String createDatabase(String database) {
        try {
            Connection con = DriverManager.getConnection(url, userName, password);
            Statement stat = con.createStatement();
            String query = String.format(CREATE_DATABASE, database.trim());
            stat.execute(query);
            con.close();
        } catch (SQLException e) {
            return e.getLocalizedMessage();
        }
        return "Database with name " + database + " created successfully";
    }

    public static String dropDatabase(String database) {
        try {
            Connection con = DriverManager.getConnection(url, userName, password);
            Statement stat = con.createStatement();
            String query = String.format(DROP_DATABASE, database.trim());
            stat.execute(query);
            con.close();
        } catch (SQLException e) {
            return e.getLocalizedMessage();
        }
        return "Database with name " + database + " deleted successfully";
    }

    public static String updateColumn(String database, String tableName, String[] columns, String[] curRow, String updatedValue, int curColNo) {
        try {
            Connection con = DriverManager.getConnection(url + database, userName, password);
            Statement stat = con.createStatement();
            String curCol = columns[curColNo];
            StringBuilder query = new StringBuilder(String.format(UPDATE_COLUMN, tableName, curCol));
            query.append("\"").append(updatedValue).append("\" where ");
            if (curColNo == columns.length - 1) curColNo = -1;
            for (int i = 0; i < columns.length; i++) {
                if (i != curColNo) {
                    query.append(columns[i]).append(" = ").append("\"").append(curRow[i]).append("\" and ");
                }
            }
            query.delete(query.length() - 5, query.length());
            stat.executeUpdate(query.toString());
            con.close();
        } catch (SQLException e) {
            return e.getLocalizedMessage();
        }
        return "Column value updated successfully";
    }

    public static String deleteRow(String database, String tableName, String[] columns, String[] curRow) {
        try {
            Connection con = DriverManager.getConnection(url + database, userName, password);
            Statement stat = con.createStatement();
            StringBuilder query = new StringBuilder(String.format(DELETE_ROW, tableName));
            for (int i = 0; i < columns.length; i++) {
                if (curRow[i] == null) continue;
                query.append(columns[i]).append(" = ").append("\"").append(curRow[i]).append("\" and ");
            }
            query.delete(query.length() - 5, query.length());
            stat.executeUpdate(query.toString());
            con.close();
        } catch (SQLException e) {
            return e.getLocalizedMessage();
        }
        return "Row deleted successfully";
    }

    public static String createTable(String query, String database) {
        try {
            Connection con = DriverManager.getConnection(url + database, userName, password);
            Statement stat = con.createStatement();
            stat.executeUpdate(query);
            con.close();
        } catch (SQLException e) {
            return e.getLocalizedMessage();
        }
        return "Table created successfully";
    }

    public static String insertRow(String query, String database) {
        try {
            Connection con = DriverManager.getConnection(url + database, userName, password);
            Statement stat = con.createStatement();
            stat.executeUpdate(query);
            con.close();
        } catch (SQLException e) {
            return e.getLocalizedMessage();
        }
        return "Row inserted successfully";
    }

    public static Object[] descTable(String database, String tableName) throws SQLException {
        List<String> cols = new ArrayList<>();
        List<List<String>> props = new ArrayList<>();
        Connection con = DriverManager.getConnection(url + database, userName, password);
        Statement stat = con.createStatement();
        String query = "DESC " + tableName;
        ResultSet rs = stat.executeQuery(query);
        ResultSetMetaData metaData = rs.getMetaData();
        for (int i = 1; i <= metaData.getColumnCount(); i++)
            cols.add(metaData.getColumnName(i));
        while (rs.next()) {
            List<String> row = new ArrayList<>();
            for (String col : cols) row.add(rs.getString(col));
            props.add(row);
        }
        con.close();
        return new Object[]{cols, props};
    }
}
