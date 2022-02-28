
package ec.edu.espe.model.updatestudents;

/**
 *
 * @author Jonathan Insuasti
 */
public class Student {
    private String ID;
    private String name;
    private int age;
    private String FirstLastName;
    private String SecondLastName;
    private float Size;

    public Student(String ID, String name, int age, String FirstLastName, String SecondLastName, float Size) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.FirstLastName = FirstLastName;
        this.SecondLastName = SecondLastName;
        this.Size = Size;
    }
    
    public Student(){
        
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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
        return FirstLastName;
    }

    public void setFirstLastName(String FirstLastName) {
        this.FirstLastName = FirstLastName;
    }

    public String getSecondLastName() {
        return SecondLastName;
    }

    public void setSecondLastName(String SecondLastName) {
        this.SecondLastName = SecondLastName;
    }

    public float getSize() {
        return Size;
    }

    public void setSize(float Size) {
        this.Size = Size;
    }
    
    
}
