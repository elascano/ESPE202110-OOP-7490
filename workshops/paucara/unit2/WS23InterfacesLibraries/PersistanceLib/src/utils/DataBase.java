
package utils;

/**
 *
 * @author Javier Paucar
 */
public interface DataBase extends DataPersistence {
    public void openConnection(String connectionString);
    public void closeConnection();
    public void generateConnectionString(String user,String password,String dataBase);
}
