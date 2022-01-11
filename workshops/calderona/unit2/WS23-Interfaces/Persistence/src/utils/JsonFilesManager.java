/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.ArrayList;

/**
 *
 * @author Andy Calderon
 */
public class JsonFilesManager implements fileManager{


    @Override
    public boolean open(String fileName) {
        return true;
    }

    @Override
    public boolean close(String fileName) {
        return true;
    }

    @Override
    public void add(String data, String table) {
        System.out.println("adding" + data + "in file" + table);

    }

    @Override
    public ArrayList<String> read(String table) {
         return new ArrayList<>();
    }

    @Override
    public void update(String table, String search, String data) {
        System.out.println("updating file ->" + table + "record ->" + search);

    }

    @Override
    public void delete(String table, String search) {
         System.out.println("deleting from file ->" + table + "the record ->" + search);
    }

    public String find(String table, String search) {
         return "found";
    } 
}
