package utils;

import java.util.ArrayList;

/**
 *
 * @author Sebas
 */
public class MySQLDBManager implements DataBase {

    @Override
    public void openConnection(String connectionString) {
        System.out.println("Connection successfully made");
    }

    @Override
    public void closeConnection() {
        System.out.println("connection ended");
    }

    @Override
    public String generateConnection(String user, String password, String database) {
        System.out.println("Insert user" + user + "insert password" + password + "database" + database);
        return null;
    }

    @Override
    public void add(String data, String table) {
        System.out.println("add data" + data + "add table" + table);
    }

    @Override
    public ArrayList<String> read(String table) {
        return new ArrayList<String>();
    }

    @Override
    public void update(String table, String search, String data) {
        System.out.println("updating table" + table + "updating data" + data);
    }

    @Override
    public void delete(String table, String search) {
        System.out.println("deleting table" + table + "searching" + search);
    }

    @Override
    public String find(String table, String search) {
        System.out.println("finding table" + table + "searching" +search );
        return null;
    }
    public void connectionString(){
        System.out.println("connection succesful"); 
    }
}
