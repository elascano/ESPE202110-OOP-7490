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
public class JsonFilesManager implements FileManager{

    
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
