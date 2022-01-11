
package utils;

/**
 *
 * @author JaimeEivar
 */
public interface FileManager extends DataPersistence {
    public boolean open(String fileName);
    public boolean close(String fileName);
    
}
