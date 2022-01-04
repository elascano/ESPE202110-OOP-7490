package ec.edu.espe.model;

/**
 *
 * @author the1/2programmer's
 */
public class Costumer {

    public Costumer(int id, String name, String last_name, String date_of_birth, String phone, String email, String category) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.birth = date_of_birth;
        this.phone = phone;
        this.email = email;
        this.category = category;
    }
    private int id;
    private String name;
    private String last_name ;
    private String birth;
    private String phone;
    private String email;
    private String category;
    
    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", last_name=" + last_name + ", birth=" + birth + ", phone" + phone + ", email=" + email + ", category=" + category + '}';
        
    }
    
   private void buy(){
       
   }
   
   private void aboutProduct (){
       
   }


    public Costumer() {
        
    id= 86547;
    name= "Lola";
    last_name= "Bueno";
    birth= "02/11/1985";
    phone= "09865475863";
    email= "lola.b@gmail.com";
    category="frequent";
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
     * @return the last_name
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * @param last_name the last_name to set
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    /**
     * @return the date_of_birth
     */
    public String getbirth() {
        return birth;
    }

    /**
     * @param birth the date_of_birth to set
     */
    public void setDate_of_birth(String birth) {
        this.birth = birth;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }
    
    
    
}
