/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package utilis;

/**
 *
 * @author MATRIZ PC
 */
public interface DataBase extends DataPersistence {
    public void openConnection(String connectionString);
    public void closeConnection();
    public void generateConnection(String user ,String password,String dataBase);
    
}
