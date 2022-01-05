/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public interface DataPersistence {
    public void add(String data, String tabla);
    public ArrayList<String> read(String table);
    public void update(String table,String search, String data);
    public void delete(String table,String search);
    public String find (String table, String search);
     
}
