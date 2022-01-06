
package utils;

/**
 *
 * @author Sebastian Palacios
 */
public interface DataBase extends DataPersistence{
    public void openConnection(String ConnectionString);
    public void closeConnection();
    public void generateConnection(String user, String password, String dataBase);
}
