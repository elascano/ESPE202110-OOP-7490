
package ec.edu.espe.OilFilter.model;

/**
 *
 * @author JaimeEivar
 */
public class OilFilter {
    
    private int Id;
    private float Weight; 
    private String Mark;
    private boolean Type;
    private boolean Visa;

    public OilFilter(int Id, float Weight, String Mark, boolean Type, boolean Visa) {
        this.Id = Id;
        this.Weight = Weight;
        this.Mark = Mark;
        this.Type = Type;
        this.Visa = Visa;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setWeight(float Weight) {
        this.Weight = Weight;
    }

    public void setMark(String Mark) {
        this.Mark = Mark;
    }

    public void setType(boolean Type) {
        this.Type = Type;
    }

    public void setVisa(boolean Visa) {
        this.Visa = Visa;
    }

    public int getId() {
        return Id;
    }

    public float getWeight() {
        return Weight;
    }

    public String getMark() {
        return Mark;
    }

    public boolean isType() {
        return Type;
    }

    public boolean isVisa() {
        return Visa;
    }
    
    
}
