
package utils;

/**
 *
 * @author Paul Saltos
 */
public interface FileManager extends DataPersistence{
    public boolean open(String fileName);
    public boolean close(String fileName); 
    
}
