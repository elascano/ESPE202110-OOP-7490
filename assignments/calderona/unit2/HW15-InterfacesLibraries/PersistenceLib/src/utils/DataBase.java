
package utils;

/**
 *
 * @author Andy Calderon 
 */
public interface DataBase extends DataPersistence{
    
    public void oppenConnection(String connectionString);
    public void closeConnection();
    public void generateConnection(String user,String password,String dataBase);
    
}
