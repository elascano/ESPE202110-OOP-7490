/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebas
 */
public class MongoConections {
    public MongoClient createConection(){
    MongoClient mongo = null;
    String servidor = "LocalHost";
    Integer puerto =27017 ;
    
        try {
            mongo = new MongoClient(servidor,puerto);
            
            List<String> DataBaseNames = mongo.getDatabaseNames();
            JOptionPane.showMessageDialog(null, "Se conecto correctamente la base de datos MongoDB"+ DataBaseNames.toString());
        } catch (MongoException e) {
            JOptionPane.showMessageDialog(null,"Error en la conexion" + e.toString());
        }
        return mongo;
    }
}
