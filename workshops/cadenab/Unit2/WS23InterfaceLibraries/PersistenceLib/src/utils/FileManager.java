
package utils;

/**
 *
 * @author Benjamin Cadena OOPTech ESPE-DCCO
 */
public interface FileManager extends DataPersistence {
    public boolean open(String fileName);
    public boolean close(String fileName);
    
}
