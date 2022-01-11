package utils;

import java.util.ArrayList;

/**
 *
 * @author Paul Saltos
 */
public class MongoDBManager implements DataBase1 {

    @Override
    public void openConnection(String connectionString) {
     System.out.println("The connection was opened" + connectionString);
    }

    @Override
    public void closeConnection() {
        System.out.println("The connection was closed");

    }

    @Override
    public void generateConnection(String user, String password, String dataBase) {
        System.out.println("Generating conection"+"Enter user"+user+"Enter password"+password+"Entered the data base"+dataBase);

    }

    @Override
    public void add(String data, String table) {
        System.out.println("adding"+data+"in file ->"+table);

    }

    @Override
    public ArrayList<String> read(String table) {
          return new ArrayList<String>();

    }

    @Override
    public void update(String table, String search, String data) {
        System.out.println("updating file ->"+table+"record"+search);

    }

    @Override
    public void delete(String table, String search) {
        System.out.println("deleting from file ->"+table+"record"+search);

    }

    @Override
    public String find(String table, String search) {
        return "found";

    }

}
