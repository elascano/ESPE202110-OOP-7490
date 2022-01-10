
package utils;

/**
 *
 * @author Angel Guaman
 */
public interface DataBase extends DataPersistence{
    
    public void oppenConnection(String connectionString);
    public void closeConnection();
    public void generateConnection(String user,String password,String dataBase);
    
}
