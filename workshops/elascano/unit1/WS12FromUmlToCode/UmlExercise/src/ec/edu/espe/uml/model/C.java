
package ec.edu.espe.uml.model;

/**
 *
 * @author elascano
 */
public class C {

    private D ds[] = new D[10];

    public E m() {

        return new E();
    }

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
