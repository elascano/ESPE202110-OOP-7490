
package ec.edu.espe.farm.model;

/**
 *
 * @author Angel Guaman
 */
public class Chicken {
    int id;
    String name;
    String color;
    int age;
    //boolean molting;
    
    public void Chicken(){
        
    }
    
    public Chicken(int id, String name, String color, int age) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void print(){
        System.out.println("The id --> " + id);
        System.out.println("The name is --> " + name);
        System.out.println("The color is --> " + color);
        System.out.println("The age is --> " + age);
    }


    
    /**
     * @return the id
    */ 
    public int getId() {
        return id;
    }

    /**
     * @param  the id to set
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
     * @param   the name to set
     
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
     * @param  the age to set
    */ 
    public void setAge(int age) {
        this.age = age;
    }    
}
