/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package utils;

/**
 *
 * @author Jose Guzman
 */
public interface DataBases extends DataPersistence{
    public void openConnection(String connectionString);
    public void closeConnection();
    public void generateConnectionString(String user,String password,String dataBase);
}
