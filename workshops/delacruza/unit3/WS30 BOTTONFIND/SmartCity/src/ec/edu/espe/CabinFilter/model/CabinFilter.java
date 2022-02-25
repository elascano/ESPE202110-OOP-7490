
package ec.edu.espe.CabinFilter.model;

/**
 *
 * @author ALEJANDRODELACRUZ
 */
public class CabinFilter {
   private int id;
    private String Name;
    private String Color;
    private int SerialNumber;
    private String Size;  
    private String Model;

    @Override
    public String toString() {
        return "CabinFilter{" + "id=" + id + ", Name=" + Name + ", Color=" + Color + ", SerialNumber=" + SerialNumber + ", Size=" + Size + ", Model=" + Model + '}';
    }

    public CabinFilter(int id, String Name, String Color, int SerialNumber, String Size, String Model) {
        this.id = id;
        this.Name = Name;
        this.Color = Color;
        this.SerialNumber = SerialNumber;
        this.Size = Size;
        this.Model = Model;
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
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * @return the SerialNumber
     */
    public int getSerialNumber() {
        return SerialNumber;
    }

    /**
     * @param SerialNumber the SerialNumber to set
     */
    public void setSerialNumber(int SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    /**
     * @return the Size
     */
    public String getSize() {
        return Size;
    }

    /**
     * @param Size the Size to set
     */
    public void setSize(String Size) {
        this.Size = Size;
    }

    /**
     * @return the Model
     */
    public String getModel() {
        return Model;
    }

    /**
     * @param Model the Model to set
     */
    public void setModel(String Model) {
        this.Model = Model;
    }
}

