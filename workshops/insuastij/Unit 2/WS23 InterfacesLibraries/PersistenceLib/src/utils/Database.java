
package utils;

/**
 *
 * @author esteb
 */
public interface Database extends DataPersistance{
    public void openConnection(String ConnectionString);
    public void closeConnection();
    public void generateConnectionString(String user, String pasword, String Database);
    
    
    
}
