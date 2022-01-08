package ec.edu.espe.cbook.model;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mayer
 */
public class Conexion {

    DB BaseDatos;
    DBCollection coleccion;
    BasicDBObject document = new BasicDBObject();

    public Conexion() {
        try {
            Mongo mongo = new Mongo("localhost", 27017);
            BaseDatos = mongo.getDB("HW14Crud");
            coleccion = BaseDatos.getCollection("MongoDB");
            System.out.println("Connect to database successfuly");
        } catch (UnknownHostException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean insertar(String accion) {
        document.put("accion", accion);
        coleccion.insert(document);
        return true;
    }

    public void mostrar() {
        DBCursor cursor = coleccion.find();
        while (cursor.hasNext()) {
            System.out.println(cursor.next());
        }
    }

    public boolean actualizar(String accionVieja, String accionNueva) {
        document.put("accion", accionVieja);
        documentNuevo.put("accion", accionNueva);
        coleccion.findAndModify(document, documentoNuevo);
        return true;
    }

    public boolean eliminar(String accion) {
        document.put("accion", accion);
        coleccion.remove(document);
        return true;
    }
}
