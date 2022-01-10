
package utils;

import java.util.ArrayList;

/**
 *
 * @author Mateo Landazuri OOP
 */
public class MySQLDBManager implements DataBase{

    @Override
    public void oppenConnection(String connectionString) {
         System.out.println("the connection was opened successfully -> " + connectionString);
    }

    @Override
    public void closeConnection() {
         System.out.println("the connection was closed successfully ");
    }

    @Override
    public void generateConnection(String user, String password, String dataBase) {
        System.out.println("Entre the user -> " + user + " Enter the password -> " + password + " the connection was made with -> " + dataBase);
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
