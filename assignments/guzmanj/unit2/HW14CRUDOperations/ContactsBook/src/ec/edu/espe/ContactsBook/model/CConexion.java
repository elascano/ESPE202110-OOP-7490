/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.ContactsBook.model;
import  com.mongodb.MongoClient;
import com.mongodb.MongoException;
import javax.swing.JOptionPane;
import java.util.List;

/**
 *
 * @author Jose Guzman
 */
public class CConexion {
    
    public MongoClient crearConexion(){
    MongoClient mongo=null;
    String servidor="localhost";
    Integer puerto=27017;
        try{    
            mongo=new MongoClient(servidor,puerto);
            
            List<String> dataBases=mongo.getDatabaseNames();
            JOptionPane.showMessageDialog(null,"Databases:" + dataBases.toString());
            
        }catch(MongoException e){
            JOptionPane.showMessageDialog(null,"Error en la conexion a MongoDB, error: " + e.toString());
        }
        return mongo;
    }    
}
