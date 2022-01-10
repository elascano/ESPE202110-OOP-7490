package utils;

/**
 *
 * @author Katherin Bravo
 */
public interface filesManager extends DataPersistence{
    public boolean open(String fileName);
    public boolean close(String fileName);
    
}
