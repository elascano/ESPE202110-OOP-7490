
package ec.edu.espe.SmartCity.model;

import java.time.LocalDate;

/**
 *
 * @author Angel Guaman
 */
public class MarketTable {
   
    private String name;
    private String hobby;
    private String cellPhoneNumber;
    private String group;
    private String  salary;
    private int id;
    private int price;
    private String Name;
    private Double date;
    private int client;

    @Override
    public String toString() {
        return "MarketTable{" + "name=" + name + ", hobby=" + hobby + ", cellPhoneNumber=" + cellPhoneNumber + ", group=" + group + ", salary=" + salary + ", id=" + id + ", price=" + price + ", Name=" + Name + ", date=" + date + ", client=" + client + ", birthdate=" + birthdate + ", comments=" + comments + '}';
    }
    

    public MarketTable(String name, String hobby, String cellPhoneNumber, String group, String salary, int id, int price, String Name, Double date, int client, String birthdate, String comments) {
        this.name = name;
        this.hobby = hobby;
        this.cellPhoneNumber = cellPhoneNumber;
        this.group = group;
        this.salary = salary;
        this.id = id;
        this.price = price;
        this.Name = Name;
        this.date = date;
        this.client = client;
        this.birthdate = birthdate;
        this.comments = comments;
    }
    

    public MarketTable(int id, String name, String hobby, String cellPhoneNumber, String group, String salary, String birthdate, String comments) {
        this.id = id;
        this.name = name;
        this.hobby = hobby;
      
        this.group = group;
        this.salary = salary;
        this.birthdate = birthdate;
        this.comments = comments;
    }
    private String birthdate;
    private String comments;

   

    public MarketTable() {
        
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

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the date
     */
    public Double getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Double date) {
        this.date = date;
    }

    /**
     * @return the client
     */
    public int getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(int client) {
        this.client = client;
    }
    
    
    
}
