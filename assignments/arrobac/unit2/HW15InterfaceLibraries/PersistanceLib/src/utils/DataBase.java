
package utils;

/**
 *
 * @author Cristian Arroba
 */
public interface DataBase extends DataPersistance {
    public void openConnection(String connectionString);
    public void closeConnection();
    public void generateConnection(String user, String password, String dataBase);
    
    
}
