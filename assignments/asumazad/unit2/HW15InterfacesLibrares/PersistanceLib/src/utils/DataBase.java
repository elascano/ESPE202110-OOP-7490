<<<<<<< HEAD
package utils;

/**
 *
 * @author dylanasumaza
 */
public interface DataBase extends DataPersistence{
 public void openConnection(String connectionString);
 public void closeConnection();
 public void generateConnection(String user, String password, String dataBase);
}
=======
package utils;

/**
 *
 * @author dylanasumaza
 */
public interface DataBase extends DataPersistence{
 public void openConnection(String connectionString);
 public void closeConnection();
 public void generateConnection(String user, String password, String dataBase);
}
>>>>>>> 93d2f95dabc6fee54e745506630ffdc595f9c066
