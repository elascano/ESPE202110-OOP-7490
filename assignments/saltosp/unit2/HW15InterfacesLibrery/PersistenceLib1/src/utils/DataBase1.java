
package utils;

/**
 *
 * @author Paul Saltos
 */
public interface DataBase1 extends DataPersistence{
    public void openConnection(String connectionString);
    public void closeConnection();
    public void generateConnection(String user ,String password,String dataBase);
    
}
