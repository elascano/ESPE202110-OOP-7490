package utils;

import java.util.ArrayList;

/**
 *
 * @Sebastian Palacios 
 */
public class MongoDBManager implements DataBase{

    @Override
    public void openConnection(String ConnectionString) {
        System.out.println("open connection -->"+ ConnectionString);
    }

    @Override
    public void closeConnection() {
        System.out.println("Close connection");
    }

    @Override
    public void generateConnection(String user, String password, String dataBase) {
        System.out.println("generate connection"+ user + "saving"+ password + "in dataBase"+ dataBase);
    }

    @Override
    public void add(String data, String table) {
        System.out.println("additing" + data + "in file ->"+ table);
    }

    @Override
    public ArrayList<String> read(String table) {
        return new ArrayList<String>();
    }

    @Override
    public void update(String table, String search, String data) {
        System.out.println("updating file"+  table + "record-->"+ search );
    }

    @Override
    public void delete(String table, String search) {
        System.out.println("deleting from file"+  table + "record-->"+ search );
    }

    @Override
    public String find(String table, String search) {
        return "found";
    }
    
}
