
package utils;

import java.util.ArrayList;

/**
 *
 * @author Anthony Morales
 */
public class MongoDBManager implements DataBase {

    @Override
    public void openConnection(String connectionString) {
        System.out.println("Connection opened successfully" + connectionString);
    }

    @Override
    public void closeConnection() {
        System.out.println("Connection closed successfully");
    }

    @Override
    public void generateConnection(String user, String password, String dataBase) {
        System.out.println("Enter the user: "+user+"Enter the password: "+password+"The connection used was: "+dataBase);
    }

    @Override
    public void add(String data, String table) {
        System.out.println("Adding data"+data+"in the file"+table);
    }

    @Override
    public ArrayList<String> read(String table) {
        return new ArrayList<String>();
    }

    @Override
    public void update(String table, String search, String data) {
        System.out.println("Updating files: "+table+"File registration"+search);
    }

    @Override
    public void delete(String table, String search) {
        System.out.println("Delete file"+table+"in the registry"+search);
    }

    @Override
    public String find(String table, String search) {
        return null;
    }
}
