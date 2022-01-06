package utils;

import java.util.ArrayList;

/**
 *
 * @author PABLO
 */
public interface DataPersistance {

    public void add(String data, String table);
    public ArrayList<String> read(String table);
    public void update(String table, String search, String data);
    public void delete(String table, String search);
    public String find(String table, String search);
}
