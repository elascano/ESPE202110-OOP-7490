package utils;

import java.util.ArrayList;

/**
 *
 * @author Cristhian Altamirano
 */
public class MongoDBManager implements DataBase{

    String connectionString;
    @Override
    public void openConnection(String connectionString) {
        System.out.println("Successful connection");
    }

    @Override
    public void closeConnection() {
        System.out.println("Connection finished");
    }

    @Override
    public void generateConnection(String user, String password, String dataBase) {
        System.out.println("The connection generated a connection string");
    }

    @Override
    public void add(String data, String table) {
       System.out.println("Adding" + data + " in file -> " + table);
    }

    @Override
    public ArrayList<String> read(String table) {
        return new ArrayList<String>();
    }

    @Override
    public void update(String table, String search, String data) {
        System.out.println("updating file -> " + table + " record " + search);
    }

    @Override
    public void delete(String table, String search) {
        System.out.println("Deleted file " + table + " is " + search);
    }

    @Override
    public String find(String table, String search) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
