
package utils;

/**
 *
 * @author Alexander Ruano
 */
public interface DataBase extends DataPersistence{
    public void openConnection(String connectionString);
    public void closeConnection();
    public void generationConnection(String user, String password,String dataBase);
    
}
