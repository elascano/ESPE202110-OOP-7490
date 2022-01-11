package utils;

/**
 *
 * @author alex_
 */
public interface FileManager extends DataPersistence {
    public boolean open(String fileName);
    public boolean close(String fileName);
}
