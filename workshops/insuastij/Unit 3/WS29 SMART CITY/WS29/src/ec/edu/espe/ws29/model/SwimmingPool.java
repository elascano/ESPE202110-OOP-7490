
package ec.edu.espe.ws29.model;

/**
 *
 * @author Jonathan Insuasti DEEE-ESPE
 */
public class SwimmingPool {
    private String id;
    private String name;
    private int age;
    private String firstLastName;
    private String secondLastName;
    private float size;

    public SwimmingPool(String id, String name, int age, String firstLastName, String secondLastName, float size) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public void setFirstLastName(String firstLastName) {
        this.firstLastName = firstLastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }
    
    
    
    
}
