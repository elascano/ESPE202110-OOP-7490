
package ec.edu.espe.Computers.model;

/**
 *
 * @author Alan
 */
public class SerialNumber {
    private int Code;

    public SerialNumber(int Code) {
        this.Code = Code;
    }

    /**
     * @return the Code
     */
    public int getCode() {
        return Code;
    }

    /**
     * @param Code the Code to set
     */
    public void setCode(int Code) {
        this.Code = Code;
    }
}
