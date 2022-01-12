
package ec.edu.espe.farm.model;

/**
 *
 * @author Anthoyn Morales
 */
public class Chicken {
    
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean molting;

    @Override
    public String toString() {
        return "\n\t\tChicken{" + "id=" + getId() + ", name=" + getName() + ", color=" + getColor() + ", age=" + getAge() + ", molting=" + isMolting() + '}';
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMolting() {
        return molting;
    }

    public void setMolting(boolean molting) {
        this.molting = molting;
    }
     
    
    
    public Chicken(int id, String name, String color, int age, boolean molting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.molting = molting;
    }
    
}