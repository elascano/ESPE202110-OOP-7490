package ec.edu.espe.farm.model;

/**
 *
 * @author alex_
 */
public class Chicken {
    private int id;
    private int age;
    private String name;
    private String color;
    private boolean isMolting;

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", age=" + age + ", name=" + name + ", color=" + color + ", isMolting=" + isMolting + '}';
    }
    
    
    public void doStuff(int forTime){
    
}
   private void cluck() {
    
    
}
    private void wander(){
    
}        
    private void eat() {
    
}
    private void drink(){
    
}
    private Poop poop(){
        return new Poop();
    
}
    private Egg layAnEgg(){
        return new Egg(1);
    
}
    public Chicken(){
        id=0;
        name= "ch";
        color = "white";
        age=0;
        isMolting= true;
    }
    
    public Chicken(int id, int age, String name, String color, boolean isMolting) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.color = color;
        this.isMolting = isMolting;
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
     * @return the isMolting
     */
    public boolean isIsMolting() {
        return isMolting;
    }

    /**
     * @param isMolting the isMolting to set
     */
    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }
}
