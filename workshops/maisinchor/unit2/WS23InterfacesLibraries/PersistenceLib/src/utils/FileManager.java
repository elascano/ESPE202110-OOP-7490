
package utils;

/**
 *
 * @author ramaisincho
 */
public interface FileManager extends DataPersistence{
    public boolean open(String fileName);
    public boolean close(String fileName);
    
}
