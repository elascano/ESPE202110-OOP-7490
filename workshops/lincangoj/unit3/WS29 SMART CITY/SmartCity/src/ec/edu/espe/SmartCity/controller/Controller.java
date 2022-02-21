/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
<<<<<<< HEAD
package ec.edu.espe.SmartCity.controller;

<<<<<<< HEAD
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;



=======
/**
 *
 * @author MATRIZ PC
=======
<<<<<<< HEAD:exams/cadenab/Unit2/Exam2UMLToCode/src/ec/edu/espe/exam/model/A.java
package ec.edu.espe.exam.model;
=======
package ec.edu.espe.SmartCity.controller;
>>>>>>> 6cc144153178c382f9eebcd761914ddea62ed9fa:workshops/lincangoj/unit3/WS29 SMART CITY/SmartCity/src/ec/edu/espe/SmartCity/controller/Controller.java

/**
 *
 * @author Benjamin Cadena OOPTech ESPE-DCCO
>>>>>>> c50923a3e00f9fd0ab967c71fc1ecc60facd57af
 */
>>>>>>> 715e053b494f15bba4eac2f4faebda85b7306265
public class Controller {
    
    public static void find(String name , DefaultTableModel table) 
    {
        MongoCollection<Document> Bone = new Connection().obtenerDB().getCollection("Bones Information");
        Document document = new Document();
        document.put("NAME", name);

        MongoCursor<Document> query = Bone.find(document).iterator();
        
        while(query.hasNext())
        {

            ArrayList<Object> doc = new ArrayList<Object>(query.next().values());
           table.addRow(doc.toArray());
        }
        

    }
}
