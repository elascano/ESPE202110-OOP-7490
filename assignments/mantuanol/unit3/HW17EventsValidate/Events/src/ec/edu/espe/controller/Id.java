
package ec.edu.espe.controller;

/**
 *
 * @author Leonel Mantuano
 */
public class Id {
    
    private int idNumber;
    private String LastName;
    private String Name;
    private String Salary;
    private String Dateofbirth;

    @Override
    public String toString() {
        return "Id{" + "idNumber=" + idNumber + ", LastName=" + LastName + ", Name=" + Name + ", Salary=" + Salary + ", Dateofbirth=" + Dateofbirth + '}';
    }

    public Id(int idNumber, String LastName, String Name, String Salary, String Dateofbirth) {
        this.idNumber = idNumber;
        this.LastName = LastName;
        this.Name = Name;
        this.Salary = Salary;
        this.Dateofbirth = Dateofbirth;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String Salary) {
        this.Salary = Salary;
    }

    public String getDateofbirth() {
        return Dateofbirth;
    }

    public void setDateofbirth(String Dateofbirth) {
        this.Dateofbirth = Dateofbirth;
    }
    
}
