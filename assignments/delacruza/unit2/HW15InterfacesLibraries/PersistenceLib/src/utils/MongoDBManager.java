package utils;

import java.util.ArrayList;

/**
 *
 * @author ALEJANDRO DELACRUZ
 */
public class MongoDBManager implements DataBase{

    @Override
    public void oppenConnection(String connectionString) {
         System.out.println("the connection was successfully -> " + connectionString);
    }

    @Override
    public void closeConnection() {
         System.out.println("the connection was closed successfully ");
    }

    @Override
    public void generateConnection(String user, String password, String dataBase) {
        System.out.println("Entrer user -> " + user + " Enter password -> " + password + " the connection was made with -> " + dataBase);
    }

    @Override
    public void add(String data, String table) {
         System.out.println("adding " + data + " in file -> " + table);
    }

    @Override
    public ArrayList<String> read(String table) {
        return new ArrayList<String>();
    }

    @Override
    public void update(String table, String search, String data) {
        System.out.println("updating file -> " + table + " record -> " +search);
    }

    @Override
    public void delete(String table, String search) {
        System.out.println("deleting from file -> " + table + " the record -> " +search);
    }

    @Override
    public String find(String table, String search) {
        return "found";
    }
    
}
