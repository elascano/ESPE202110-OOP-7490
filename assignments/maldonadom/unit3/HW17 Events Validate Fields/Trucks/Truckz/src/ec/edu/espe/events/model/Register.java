
package ec.edu.espe.events.model;

import java.util.Date;

/**
 *
 * @author MateoMaldonado
 */
public class Register {
    
    private int idNumber;
    private String lastName;
    private String name;
    private Date birthdate;
    private float salary;

    public Register(int idNumber, String lastName, String name, Date birthdate, float salary) {
        this.idNumber = idNumber;
        this.lastName = lastName;
        this.name = name;
        this.birthdate = birthdate;
        this.salary = salary;
    }

    /**
     * @return the idNumber
     */
    public int getIdNumber() {
        return idNumber;
    }

    /**
     * @param idNumber the idNumber to set
     */
    public void setIdNumber(int idNumber) {
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
     * @return the birthdate
     */
    public Date getBirthdate() {
        return birthdate;
    }

    /**
     * @param birthdate the birthdate to set
     */
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
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
