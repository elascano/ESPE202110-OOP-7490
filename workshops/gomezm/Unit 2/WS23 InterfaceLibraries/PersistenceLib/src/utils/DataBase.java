
package utils;

/**
 *
 * @author Melissa Gómez
 */
public interface DataBase extends DataPersistence{
    public void openConnection(String connectionString);
    public void closeConection();
    public String generateConnection(String user, String password, String dataBase);
}
