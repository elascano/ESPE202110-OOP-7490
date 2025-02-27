package utils;

/**
 *
 * @author Joel Zeas
 */
public interface DataBase extends DataPersistence{
    public void openConnection(String connectionString);
    public void closeConnection();
    public void generateConnection(String user, String password, String dataBase);
}
