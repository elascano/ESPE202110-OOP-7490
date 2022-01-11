
package utils;

import java.util.ArrayList;

/**
 *
 * @author Camila
 */
public class MySQLDBManager implements DataBase{

    @Override
    public void openConnection(String connectionString) {
        System.out.println("opening connection --> " + connectionString);
    }

    @Override
    public void closeConnection() {
        System.out.println("closing connection");
    }

    @Override
    public void generateConnection(String user, String password, String dataBase) {
        System.out.println("generating connection " + user + "saving --> " + password + "in databaBase" + dataBase);
    }

    @Override
    public void add(String data, String table) {
        System.out.println("adding in database " + data + "in File --> " + table);
    }

    @Override
    public ArrayList<String> read(String table) {
        return new ArrayList<String>();
    }

    @Override
    public void update(String table, String search, String data) {
        System.out.println("updating file --> " + table + "record --> " + search);
    }

    @Override
    public void delete(String table, String search) {
         System.out.println("deleting from file --> " + table + "record --> " + search);
    }

    @Override
    public String find(String table, String search) {
        return "found";
    }
    
}
