
package utils;

import java.util.ArrayList;

/**
 *
 * @author Javier Paucar
 */
public interface DataPersistence {
    public void add(String data,String table);
    public ArrayList<String> read(String table);
    public void updated(String table,String search,String data);
    public void delete(String table,String search);
    public String find(String table,String search);
}
