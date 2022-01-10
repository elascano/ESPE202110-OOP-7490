package ec.edu.espe.farm.model;

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
        return "\n\t\tChicken{" + "id=" + getId() + ", name=" + getName() + ", color=" + getColor() + ", age=" + getAge() + ", molting=" + isMolting() + '}';
    }
    
    
=======
        return "\n\tChicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", molting=" + molting + '}';
    }

    public Chicken(int id, String name, String color, int age, boolean molting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.molting = molting;
    }

    /**
     * @return the id
     */
>>>>>>> 71e45a7ee083858baea8f637f5e58720acfe5d6c
    public int getId() {
        return id;
    }

<<<<<<< HEAD
=======
    /**
     * @param id the id to set
     */
>>>>>>> 71e45a7ee083858baea8f637f5e58720acfe5d6c
    public void setId(int id) {
        this.id = id;
    }

<<<<<<< HEAD
=======
    /**
     * @return the name
     */
>>>>>>> 71e45a7ee083858baea8f637f5e58720acfe5d6c
    public String getName() {
        return name;
    }

<<<<<<< HEAD
=======
    /**
     * @param name the name to set
     */
>>>>>>> 71e45a7ee083858baea8f637f5e58720acfe5d6c
    public void setName(String name) {
        this.name = name;
    }

<<<<<<< HEAD
=======
    /**
     * @return the color
     */
>>>>>>> 71e45a7ee083858baea8f637f5e58720acfe5d6c
    public String getColor() {
        return color;
    }

<<<<<<< HEAD
=======
    /**
     * @param color the color to set
     */
>>>>>>> 71e45a7ee083858baea8f637f5e58720acfe5d6c
    public void setColor(String color) {
        this.color = color;
    }

<<<<<<< HEAD
=======
    /**
     * @return the age
     */
>>>>>>> 71e45a7ee083858baea8f637f5e58720acfe5d6c
    public int getAge() {
        return age;
    }

<<<<<<< HEAD
=======
    /**
     * @param age the age to set
     */
>>>>>>> 71e45a7ee083858baea8f637f5e58720acfe5d6c
    public void setAge(int age) {
        this.age = age;
    }

<<<<<<< HEAD
=======
    /**
     * @return the molting
     */
>>>>>>> 71e45a7ee083858baea8f637f5e58720acfe5d6c
    public boolean isMolting() {
        return molting;
    }

<<<<<<< HEAD
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
    
=======
    /**
     * @param molting the molting to set
     */
    public void setMolting(boolean molting) {
        this.molting = molting;
    }

>>>>>>> 71e45a7ee083858baea8f637f5e58720acfe5d6c
}
