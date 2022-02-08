
package ec.edu.espe.model;

import org.bson.Document;

/**
 *
 * @author Maisincho Richar
 */
public class Registration {

    public static void insertOne(Document data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private int cedula;
    private String name,lastName;
    private int Salary;
    private String date;

    public Registration(int cedula, String name, String lastName, int Salary, String date) {
        this.cedula = cedula;
        this.name = name;
        this.lastName = lastName;
        this.Salary = Salary;
        this.date = date;
    }

    public int getId() {
        return cedula;
    }

    public void setId(int id) {
        this.cedula = cedula;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
