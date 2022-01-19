/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espe.Q71to100.model;

import java.util.ArrayList;

/**
 *
 * @author Jose Guzman
 */
public interface ManageInformationComputers {
    public void add(String data,String table);
    public ArrayList<String> read(String table);
    public void update(String table,String search,String data);
    public void delete(String table,String search);
}
