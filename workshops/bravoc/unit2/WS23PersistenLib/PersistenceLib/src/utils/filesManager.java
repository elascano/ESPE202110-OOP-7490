package utils;

/**
 *
 * @author Christian Bravo
 */
public interface filesManager extends DataPersistence{
    public boolean open(String fileName);
    public boolean close(String fileName);
    
}
