package utils;

/**
 *
 * @author PABLO
 */
public interface  FileManager extends  DataPersistance{
    public boolean open(String fileName);
    public boolean close(String fileName);
}
