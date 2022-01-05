
package ec.edu.espe.inventory.model;

import java.util.Vector;

/**
 *
 * @author WorBotsTeam
 */
public class Search {
    int Product,Code;
        static Product busqueda(int codigo, Vector productos){
        boolean band = false;
        Product p,retornP = null;
        for(int x = 0; x < productos.size(); x++){ 
            p = (Product) productos.elementAt(x);
            if(p.getCode() == codigo)
                retornP = p;
        }
        return retornP;
    }
}

