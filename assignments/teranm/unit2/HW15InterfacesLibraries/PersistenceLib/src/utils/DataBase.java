package utils;

/**
 *
 * @author Melanie
 */
public interface DataBase extends DataPersistence{
    public void openConnection(String connectionString);
    public void closConnection();
    public void generateConnection(String user, String password, String dataBase);
}
