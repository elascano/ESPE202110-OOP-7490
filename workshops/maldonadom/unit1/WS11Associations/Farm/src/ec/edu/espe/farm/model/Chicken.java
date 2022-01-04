<<<<<<< HEAD
package ec.edu.espe.farm.model;
=======
package ec.edu.espe.menu.model;
>>>>>>> 71e45a7ee083858baea8f637f5e58720acfe5d6c

/**
 *
 * @author MateoMaldonado
 */
public class Chicken {
<<<<<<< HEAD
    
=======

>>>>>>> 71e45a7ee083858baea8f637f5e58720acfe5d6c
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean molting;

    @Override
    public String toString() {
<<<<<<< HEAD
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", molting=" + molting + '}';
    }
    
    
    public void doStuff(int forTime){
        
    }
    
    private void cluck(){
        
    }
    
    private void wander(){
        
    }
    
    private void eat(){
        
    }
    
    private void drink(){
        
    }
    
    private Poop poop(){
        
        return new Poop();
    }
    
    private Egg layAnEgg(){
        
        return new Egg(1);
    }

    public Chicken() {
        id=0;
        name="ch";
        color="white";
        age=0;
        molting=false;
    }
    
    public Chicken(int id, String name, String color, int age, boolean isMolting) {
=======
        return "\n\tChicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", molting=" + molting + '}';
    }

    public Chicken(int id, String name, String color, int age, boolean molting) {
>>>>>>> 71e45a7ee083858baea8f637f5e58720acfe5d6c
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.molting = molting;
    }
<<<<<<< HEAD
    
=======

>>>>>>> 71e45a7ee083858baea8f637f5e58720acfe5d6c
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
<<<<<<< HEAD
=======

>>>>>>> 71e45a7ee083858baea8f637f5e58720acfe5d6c
}
