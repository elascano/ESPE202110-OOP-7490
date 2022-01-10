 
package utils;

import java.util.ArrayList;

/**
 *
 * @author Anderson
 */
public class MongoDBManager implements DataBase {

    @Override
    public void openConnection(String connectionString) {
        System.out.println("the connection was opened succesfully ->" + connectionString);
    }

    @Override
    public void closeConnection() {
        System.out.println("the connection was closed succesfully");
    }

    @Override
    public void generateConnection(String user, String password, String dataBase) {
        System.out.println("Enter the user ->" + user + "Enter the password ->" + password + "the connection was made with ->" + dataBase);
    }

    @Override
    public void add(String data, String table) {
        System.out.println("adding " + data + "in file -> " + table);
    }

    @Override
    public ArrayList<String> read(String table) {
        return new ArrayList<String>();
    }

    @Override
    public void update(String table, String search, String data) {
        System.out.println("updating file ->" + table +"record ->" + search);
    }

    @Override
    public void delete(String table, String search) {
        System.out.println("Delete file" + table + "is" + search);
    }

    @Override
    public String find(String table, String search){
        return "found";  
    }
    
}
