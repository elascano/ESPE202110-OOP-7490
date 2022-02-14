package ec.edu.espe.Excercise.model;

/**
 *
 * @author Javier Paucar
 */
public class C {

    private D ds[] = new D[10];

    @Override
    public String toString() {
        return "C{" + "ds=" + ds + '}';
    }

    public C(D ds[]) {
        this.ds = ds;
    }

    public C() {

    }

    public E m() {
        return new E();
    }

}
