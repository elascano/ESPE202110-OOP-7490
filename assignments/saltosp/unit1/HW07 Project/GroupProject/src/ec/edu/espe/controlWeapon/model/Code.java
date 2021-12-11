package ec.edu.espe.controlWeapon.model;

/**
 *
 * @author Paul Saltos
 */
public class Code {

    private String name;
    private String model;
    private String type;
    private String date;
    private String id;

    @Override
    public String toString() {
        return "Code{" + "name=" + getName() + ", model=" + getModel() + ", type=" + getType() + ", date=" + getDate() + ", id=" + getId() + '}';
    }

    public Code(String name, String model, String type, String date, String id) {
        this.name = name;
        this.model = model;
        this.type = type;
        this.date = date;
        this.id = id;
    }
    
    public Code() {
        
        System.out.println("\n---------------> DATA Ammunition1 <--------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("---  name  --> ");
        name = scanner.next();
        System.out.println("---  color --> ");
        color = scanner.next();
        System.out.println("---  model --> ");
        model = scanner.next();
 
        
    
}

    public void doStuff() {

    }

    private void registration() {

    }

    private void reception() {

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
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
}
