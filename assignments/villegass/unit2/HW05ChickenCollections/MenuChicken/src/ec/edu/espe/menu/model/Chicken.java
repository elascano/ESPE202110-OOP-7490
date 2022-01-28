<<<<<<< HEAD
<<<<<<< HEAD:assignments/villegass/unit2/HW05ChickenCollections/MenuChicken/src/ec/edu/espe/menu/model/Chicken.java
=======
>>>>>>> 93d2f95dabc6fee54e745506630ffdc595f9c066
package ec.edu.espe.menu.model;

/**
 *
 * @author Salma Villegas
<<<<<<< HEAD
=======

package ec.edu.espe.farm.model;

/**
 *
 * @author alan
>>>>>>> 93d2f95dabc6fee54e745506630ffdc595f9c066:workshops/shugulia/unit2/WS16Collection/Farm/src/ec/edu/espe/farm/model/Chicken.java
 */
public class Chicken {
=======
 */
public class Chicken {

>>>>>>> 93d2f95dabc6fee54e745506630ffdc595f9c066
    private int id;
    private String name;
    private String color;
    private int age;
<<<<<<< HEAD
<<<<<<< HEAD:assignments/villegass/unit2/HW05ChickenCollections/MenuChicken/src/ec/edu/espe/menu/model/Chicken.java
=======
>>>>>>> 93d2f95dabc6fee54e745506630ffdc595f9c066
    private boolean isMolting;

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", isMolting=" + isMolting + '}';
<<<<<<< HEAD
=======
    private boolean molting;
    
    @Override
    public String toString() {
        return "\n\t\tChicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", molting=" + molting + '}';
>>>>>>> 93d2f95dabc6fee54e745506630ffdc595f9c066:workshops/shugulia/unit2/WS16Collection/Farm/src/ec/edu/espe/farm/model/Chicken.java
    }
        

<<<<<<< HEAD:assignments/villegass/unit2/HW05ChickenCollections/MenuChicken/src/ec/edu/espe/menu/model/Chicken.java
    public Chicken(int id, String name, String color, int age, boolean isMolting) {
=======
    public Chicken(int id, String name, String color, int age, boolean molting) {
>>>>>>> 93d2f95dabc6fee54e745506630ffdc595f9c066:workshops/shugulia/unit2/WS16Collection/Farm/src/ec/edu/espe/farm/model/Chicken.java
=======
    }

    public Chicken(int id, String name, String color, int age, boolean isMolting) {
>>>>>>> 93d2f95dabc6fee54e745506630ffdc595f9c066
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
<<<<<<< HEAD
<<<<<<< HEAD:assignments/villegass/unit2/HW05ChickenCollections/MenuChicken/src/ec/edu/espe/menu/model/Chicken.java
        this.isMolting = isMolting;
=======
        this.molting = molting;
>>>>>>> 93d2f95dabc6fee54e745506630ffdc595f9c066:workshops/shugulia/unit2/WS16Collection/Farm/src/ec/edu/espe/farm/model/Chicken.java
    }

        
=======
        this.isMolting = isMolting;
    }

>>>>>>> 93d2f95dabc6fee54e745506630ffdc595f9c066
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
<<<<<<< HEAD
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
    
    
    
=======
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
>>>>>>> 93d2f95dabc6fee54e745506630ffdc595f9c066
}
