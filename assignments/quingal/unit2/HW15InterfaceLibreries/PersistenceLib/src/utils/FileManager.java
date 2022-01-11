/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Usuario
 */
public interface FileManager extends  DataPersistence{
    public boolean open(String fileName);
    public boolean close(String fileName);
}
