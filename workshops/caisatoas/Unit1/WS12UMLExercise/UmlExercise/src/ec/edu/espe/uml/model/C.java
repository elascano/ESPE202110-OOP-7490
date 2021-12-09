
package ec.edu.espe.uml.model;

/**
 *
 * @author Caisatoa
 */
public class C {
    private D ds[] = new D[10];

    @Override
    public String toString() {
        return "C{" + "ds=" + ds + '}';
    }
    public C() {
        
    }
    
    public C(D ds[]) {
        this.ds = ds;
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
