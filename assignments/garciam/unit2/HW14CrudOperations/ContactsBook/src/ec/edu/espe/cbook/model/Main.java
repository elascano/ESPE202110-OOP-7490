
package ec.edu.espe.cbook.model;

/**
 *
 * @author mayer
 */
public class Main {
    public static void main(String[]args){
        Connection conexion = new Connection();
        
        conexion.insertar("id:01,name:Joel,cell:09875567,sex:Male,hobby:Play soccer");
        
    }
}
