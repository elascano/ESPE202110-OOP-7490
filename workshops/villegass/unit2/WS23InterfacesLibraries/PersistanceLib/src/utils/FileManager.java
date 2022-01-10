
package utils;

/**
 *
 * @author Salma Villegas
 */
public interface FileManager extends DataPersistance {
    public boolean open(String fileName);
    public boolean close(String fileName);
}
