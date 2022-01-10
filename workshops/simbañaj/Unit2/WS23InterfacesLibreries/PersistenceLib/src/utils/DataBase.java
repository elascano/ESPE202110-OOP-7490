
package utils;

/**
 *
 * @author Simbaña
 */
public interface DataBase extends DataPersistence{
    public void openConnections(String connection);
    public void closeConnection();
    public void generateConnection(String user,String password,String dataBase);
}
