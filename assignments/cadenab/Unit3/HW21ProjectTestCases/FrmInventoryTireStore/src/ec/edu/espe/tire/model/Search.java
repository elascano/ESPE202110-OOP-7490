
package ec.edu.espe.tire.model;

import java.util.Vector;

/**
 *
 * @author WorBotsTeam
 */
public class Search {
    int Product,Code;
        static Product busqueda(int code, Vector products){
        boolean band = false;
        Product p,retornP = null;
        for(int x = 0; x < products.size(); x++){ 
            p = (Product) products.elementAt(x);
            if(p.getCode() == code)
                retornP = p;
        }
        return retornP;
    }
}

