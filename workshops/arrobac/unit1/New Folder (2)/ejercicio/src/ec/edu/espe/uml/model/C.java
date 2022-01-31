
package ec.edu.espe.uml.model;

/**
 *
 * @author HP
 */
public class C {
    private D ds[]=new D[10];
    
    public E m(){
        return new E();
                
    }

    /**
     * @return the ds
     */
    public D[] getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(D[] ds) {
        this.ds = ds;
    }
}
