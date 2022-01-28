/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package utils;

/**
 *
 * @author José
 */
public interface FileManager extends DataPersistence {
    public boolean open(String fileName);    
    public boolean close(String fileName);
}
