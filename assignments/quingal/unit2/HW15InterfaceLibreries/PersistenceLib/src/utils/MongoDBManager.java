/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.ArrayList;

/**
 *
 * @author Quinga Leandro 
 */
public class MongoDBManager implements DataBase {

    @Override
    public void openConnection(String connectionString) {
        System.out.println("The connection was opened" + connectionString);
    }

    @Override
    public void closeConnection() {
        System.out.println("The connection was closed");
    }

    @Override
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
    
}
