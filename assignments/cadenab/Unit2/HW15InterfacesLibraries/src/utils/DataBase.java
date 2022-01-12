
package utils;

/**
 *
 * @author Benjamin Cadena OOPTech ESPE-DCCO
 */
public interface DataBase extends DataPersistence {
    public void openConnection(String connectionString);
    public void closeConnection();
    public void generateConnectionString(String user, String password, String dataBase);
    
}
