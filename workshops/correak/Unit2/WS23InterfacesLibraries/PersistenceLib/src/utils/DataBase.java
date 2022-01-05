/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author USUARIO
 */
public interface DataBase extends DataPersistence {
    public void openConnection(String connectionString);
    public void closeConnection();
    public void generateConnection(String user,String password, String dataBase);
}
