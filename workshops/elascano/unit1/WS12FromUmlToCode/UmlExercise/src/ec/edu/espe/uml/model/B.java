package ec.edu.espe.uml.model;

/**
 *
 * @author elascano
 */
public class B {

    private C cs[];

    @Override
    public String toString() {

        String toReturn;
        toReturn = "B{" + "cs=";

        for (int i = 0; i < cs.length; i++) {
            toReturn = toReturn + "cs[" + i + "] -> " +cs[i] +"\n";
        }
        toReturn = toReturn + "} \n";
        return toReturn;
    }

    public B(C[] cs) {
        this.cs = cs;
    }

    /**
     * @return the cs
     */
    public C[] getCs() {
        return cs;
    }

    /**
     * @param cs the cs to set
     */
    public void setCs(C[] cs) {
        this.cs = cs;
    }

}
