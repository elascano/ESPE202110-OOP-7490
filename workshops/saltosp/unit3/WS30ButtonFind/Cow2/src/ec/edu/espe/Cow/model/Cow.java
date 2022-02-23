

package ec.edu.espe.Cow.model;

/**
 *
 * @author Paul Saltos
 */
public class Cow {
    
    private int id;
    private String name;
    private String color;
    private int age;
    private String product;
    private String poop;

    public Cow(int id, String name, String color, int age, String product, String poop) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.product = product;
        this.poop = poop;
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
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the product
     */
    public String getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * @return the poop
     */
    public String getPoop() {
        return poop;
    }

    /**
     * @param poop the poop to set
     */
    public void setPoop(String poop) {
        this.poop = poop;
    }
    
    
    
    
}
