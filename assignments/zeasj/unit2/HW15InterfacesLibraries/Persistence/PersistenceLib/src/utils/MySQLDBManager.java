package utils;

import java.util.ArrayList;

/**
 *
 * @author Joel Zeas
 */
public class MySQLDBManager implements DataBase{

    @Override
    public void openConnection(String connectionString) {
       System.out.println("The connection was successfully opened -> " + connectionString);
    }

    @Override
    public void closeConnection() {
        System.out.println("The connection was successfully closed -> ");
    }

    @Override
    public void generateConnection(String user, String password, String dataBase) {
        System.out.println("Enter the user -> " + user + "Enter password -> " + password + " the connection was made with -> " + dataBase);
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
        System.out.println("Updating file -> " + table + " record -> " + search);
    }

    @Override
    public void delete(String table, String search) {
        System.out.println("Deleting from file -> " + table + " the record -> " + search);
    }

    @Override
    public String find(String table, String search) {
        return "found";
    }
    
}
