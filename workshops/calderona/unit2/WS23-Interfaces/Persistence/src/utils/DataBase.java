/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package utils;

/**
 *
 * @author Andy Calderon
 */
public interface DataBase extends DataPersistence{
    public void openConnection(String connectionString);
    public void closeConnection();
    public boolean close(String fileName);
   
}
