package ec.edu.espe.house.model;

/**
 *
 * @author pc
 */
public class Person {
    private String Name;
    private String Ci;
    private String Cellphone;

    public Person(String Name, String Ci, String Cellphone) {
        this.Name = Name;
        this.Ci = Ci;
        this.Cellphone = Cellphone;
    }

    public Person(String Name, String Ci, int Cellphone) {
        
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCi() {
        return Ci;
    }

    public void setCi(String Ci) {
        this.Ci = Ci;
    }

    public String getCellphone() {
        return Cellphone;
    }

    public void setCellphone(String Cellphone) {
        this.Cellphone = Cellphone;
    }
    
    
}
