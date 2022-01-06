/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.ArrayList;

/**
 *
 * @author Jose Guzman
 */
public class MongoDBManager implements DataBases{

    @Override
    public void openConnection(String connectionString) {
        System.out.println("Status" + connectionString);
    }

    @Override
    public void closeConnection() {
        System.out.println("Disconnected");
    }

    @Override
    public void generateConnectionString(String user, String password, String dataBase) {
        System.out.println("Welcome the "+user+" with " +password+ "has "+dataBase);
    }

    @Override
    public void add(String data, String table) {
        System.out.println("the " + data + "insert:" + table);
    }

    @Override
    public ArrayList<String> read(String table) {
        return new ArrayList<String>();
    }

    @Override
    public void update(String table, String search, String data) {
        System.out.println("The " + table + " looked " + search + " is " + data);
    }

    @Override
    public void delete(String table, String search) {
        System.out.println("The " + table + " is " + search);
    }

    @Override
    public String find(String table, String search) {
        return "found";
    }
    
}
