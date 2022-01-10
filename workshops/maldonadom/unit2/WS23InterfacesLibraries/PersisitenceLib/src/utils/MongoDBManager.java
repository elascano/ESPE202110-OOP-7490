/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.ArrayList;

/**
 *
 * @author MateoMaldonado
 */
public class MongoDBManager implements DataBase{

    @Override
    public void openConnection(String connectionString) {
        System.out.println("the connection was opened succesfully ->" + connectionString);
    }

    @Override
    public void closeConnection() {
        System.out.println("the connection was closed succesfully");
    }

    @Override
    public void gejerateConectionString(String user, String password, String dataBase) {
        System.out.println("Entre the user -> " + user + " Enter the password ->" + password + " the connection was made with ->");
    }

    @Override
    public void add(String data, String table) {
        System.out.println("adding" + data + "in file ->" + table);
    }

    @Override
    public ArrayList<String> read(String table) {
        return new ArrayList<String>();
    }

    @Override
    public void update(String table, String search, String data) {
        System.out.println("uptading file ->" + table + " record ->" + search);
    }

    @Override
    public void delete(String table, String search) {
        System.out.println("deleting from file --> " + table + "the record-->" + search);
    }

    @Override
    public String find(String table, String search) {
        return "found";
    }
    
}
