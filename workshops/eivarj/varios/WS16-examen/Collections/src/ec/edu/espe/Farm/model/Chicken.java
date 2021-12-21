
package ec.edu.espe.Farm.model;

/**
 *
 * @author JaimeEivar
 */
public class Chicken {
    private int Id;
    private String name;
    private String color;
    private int age;
    private boolean molting;

    @Override
    public String toString() {
        return "\n\t\tChicken{" + "Id=" + Id + ", name=" + name + ", color=" + color + ", age=" + age + ", molting=" + molting + '}';
    }

    
    
    public Chicken(int Id, String name, String color, int age, boolean molting) {
        this.Id = Id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.molting = molting;
    }

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
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
     * @return the molting
     */
    public boolean isMolting() {
        return molting;
    }

    /**
     * @param molting the molting to set
     */
    public void setMolting(boolean molting) {
        this.molting = molting;
    }
    
    
}
