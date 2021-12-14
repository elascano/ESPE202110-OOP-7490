

/**
 *
 * @author JaimeEivar
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean Molthing;

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", Molthing=" + Molthing + '}';
    }

    public Chicken(int id, String name, String color, int age, boolean Molthing) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.Molthing = Molthing;
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
     * @return the Molthing
     */
    public boolean isMolthing() {
        return Molthing;
    }

    /**
     * @param Molthing the Molthing to set
     */
    public void setMolthing(boolean Molthing) {
        this.Molthing = Molthing;
    }
    
    
    
}
