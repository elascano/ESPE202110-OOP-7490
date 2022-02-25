package ec.edu.espe.contacts.model;

/**
 *
 * @author Sebastian Palacios
 */
public class ContactsRegist {
    private int idNumber;
    private String lastName;
    private String name;
    private String birthDate;
    private float salary;

    public ContactsRegist(int idNumber, String lastName, String name, String birthDate, float salary) {
        this.idNumber = idNumber;
        this.lastName = lastName;
        this.name = name;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    /**
     * @return the cedula
     */
    public int getCedula() {
        return idNumber;
    }

    /**
     * @param idNumber the cedula to set
     */
    public void setCedula(int idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the birthDate
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the salary
     */
    public float getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }
    
}
