/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.ArrayList;

/**
 *
 * @author José
 */
public class MongoDBManager implements FileManager{

 
    public void openConnection(String connectionString) {
        System.out.println("The connection was opened" + connectionString);
    }

    public void closeConnection() {
        System.out.println("The connection was closed");
    }

    public void generationConnecton(String user, String password, String dataBase) {
        System.out.println("Generating conection"+"Enter user"+user+"Enter password"+password+"Entered the data base"+dataBase);
    }

    @Override
    public void add(String data, String table) {
        System.out.println("adding"+data+"in file ->"+table);
    }

    @Override
    public ArrayList<String> read(String table) {
        return new ArrayList<String>();
    }

    @Override
    public void update(String table, String search, String data) {
        System.out.println("updating file ->"+table+"record"+search);
    }

    @Override
    public void delete(String table, String search) {
        System.out.println("deleting from file ->"+table+"record"+search);
    }

    @Override
    public String find(String table, String search) {
        return "found";
    }

    @Override
    public boolean open(String fileName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean close(String fileName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
