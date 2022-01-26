/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package utils;

/**
 *
 * @author Usuario
 */
public interface DataBase {
    public void openConnection(String connectionString);
    public void closeConnection();
    public String generateConnection(String user, String password, String dataBase);
}
