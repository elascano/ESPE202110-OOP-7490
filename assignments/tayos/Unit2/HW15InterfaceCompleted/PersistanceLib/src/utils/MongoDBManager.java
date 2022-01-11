package utils;

import java.util.ArrayList;

/**
 *
 * @author Sebas
 */
public class MongoDBManager implements DataBase {

    @Override
    public void openConnection(String connectionString) {
        System.out.println("File was Opened");
    }

    @Override
    public void closeConnection() {
        System.out.println("File was closed");
    }

    @Override
    public String generateConnection(String user, String password, String database) {
        System.out.println("insert user" + user + "insert password" + password + "Connecing to dataBase" + database);
        return null;
    }

    @Override
    public void add(String data, String table) {
        System.out.println("add data" + data + "Insert table" + table);
    }

    @Override
    public ArrayList<String> read(String table) {
        return new ArrayList<String>();
    }

    @Override
    public void update(String table, String search, String data) {
        System.out.println("updating table" + table + "searching" + search + "Update data" + data);
    }

    @Override
    public void delete(String table, String search) {
        System.out.println("deleting table" + table +"searching" + search);
    }

    @Override
    public String find(String table, String search) {
        System.out.println("find table" + table + "search" + search);
        return null;
    }

    public void connectionString() {
        System.out.println("connection succesful");
    }
}
