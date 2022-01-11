

package utils;

import java.util.ArrayList;

/**
 *
 * @author Katherin Bravo
 */
public class MongoDBManager implements DataBse{

    @Override
    public void oppenConnection(String connectionString) {
        System.out.println("The connection was open successfully" + connectionString);
    }

    @Override
    public void closeConnection() {
        System.out.println("The connrction was close succesfully ");
        
    }

    @Override
    public void generationConnectString(String user, String password, String dataBase) {
        System.out.println("Enter the user"+ user+ "Enter the password"+ password + "connection was made with");
    }

    @Override
    public void add(String data, String table) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<String> read(String table) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(String table, String search, String data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(String table, String search) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String find(String table, String search) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void openConnectionString(String connectionString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
