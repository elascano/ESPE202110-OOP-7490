
package ec.edu.espe.cbook.model;

import java.time.LocalDate;

/**
 *
 * @author Angel Guaman
 */
public class Aircrafts {
    private int id;
    private String name;
    private String hobby;
    private String cellPhoneNumber;
   
    private String group;
    private String  salary;

    public Aircrafts(int id, String name, String hobby, String cellPhoneNumber, String group, String salary, String birthdate, String comments) {
        this.id = id;
        this.name = name;
        this.hobby = hobby;
        this.cellPhoneNumber = cellPhoneNumber;
        this.group = group;
        this.salary = salary;
        this.birthdate = birthdate;
        this.comments = comments;
    }
    private String birthdate;
    private String comments;

   

    public Aircrafts() {
        
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the hobby
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * @param hobby the hobby to set
     */
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    /**
     * @return the cellPhoneNumber
     */
    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    /**
     * @param cellPhoneNumber the cellPhoneNumber to set
     */
    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    /**
     * @return the sex
     */
    

    /**
     * @param sex the sex to set
     */
   

    /**
     * @return the group
     */
    public String getGroup() {
        return group;
    }

    /**
     * @param group the group to set
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * @return the salary
     */
    public String getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(float salary) {
        this.setSalary(salary);
    }

    /**
     * @return the birthdate
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     * @param birthdate the birthdate to set
     */
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * @return the comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(String salary) {
        this.salary = salary;
    }
    
    
    
}
