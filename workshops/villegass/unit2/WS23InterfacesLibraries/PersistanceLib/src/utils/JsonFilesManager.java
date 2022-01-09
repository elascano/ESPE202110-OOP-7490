
package utils;

import java.util.ArrayList;

/**
 *
 * @author Salma Villegas
 */
public class JsonFilesManager implements FileManager{

    @Override
    public boolean open(String fileName) {
        return true;
    }

        
    @Override
    public boolean close(String fileName) {
        return true;
    }

    @Override
    public void add(String data, String table) {
        System.out.println("adding" + data + "in file ->" + table);
    }

    @Override
    public ArrayList<String> read(String table) {
        return new ArrayList<String>();
    }

    @Override
    public void update(String table, String search, String data) {
        System.out.println("updating file ->" + table + "record ->" + search);
    }

    @Override
    public void delete(String table, String search) {
        System.out.println("");
    }

    @Override
    public String find(String table, String search) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

