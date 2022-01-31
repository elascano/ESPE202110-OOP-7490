
package utils;

/**
 *
 * @author esteb
 */
public interface FileManager extends DataPersistance{
    public boolean open(String fileName);
    public boolean close(String fileName);
    
}
