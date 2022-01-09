/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package utils;

import java.util.ArrayList;

/**
 *
 * @author José
 */
public interface DataPersistence {
    public void add(String data, String Table);
    public ArrayList<String> read(String table);
    public void update(String table, String search,String data);
    public void delete(String table, String search);
    public String find(String table,String search);
}
