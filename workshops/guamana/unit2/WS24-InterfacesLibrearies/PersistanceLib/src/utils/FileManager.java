package utils;

/**
 *
 * @author Angel Guaman
 */
public interface  FileManager extends  DataPersistance{
    public boolean open(String fileName);
    public boolean close(String fileName);
}
