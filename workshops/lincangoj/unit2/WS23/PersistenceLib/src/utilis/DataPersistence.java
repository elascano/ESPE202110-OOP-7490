/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package utilis;

import java.util.ArrayList;

/**
 *
 * @author MATRIZ PC
 */
public interface DataPersistence {
    public void add (String data,String table);
    public ArrayList<String> read (String table);
    public void update(String table,String search,String data);
    public void delete(String table,String search);
    public String find(String table,String search);
    
}

