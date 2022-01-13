package utils;

/**
 *
 * @author guitarraJhon
 */
public interface filesManager extends DataPersistence{
    public boolean open(String fileName);
    public boolean close(String fileName);
    
}
