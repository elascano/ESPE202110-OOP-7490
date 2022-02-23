package humanresources;

/**
 *
 * @author Leonel.M
 */
public class HumanResources {
    
    private String Name;
    private int hoursworked;
    private float hourly_pay;
    private float salary;

    public String getName() {
        return Name;
    }

    public int getHoursworked() {
        return hoursworked;
    }

    public float getHourly_pay() {
        return hourly_pay;
    }

    public float getSalary() {
        return salary;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setHoursworked(int hoursworked) {
        this.hoursworked = hoursworked;
    }

    public void setHourly_pay(float hourly_pay) {
        this.hourly_pay = hourly_pay;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    public void calculatesalary(){
        salary=hoursworked*hourly_pay;
    
}
    
    
    
    
    
    
    
}
    
    
   
 
    