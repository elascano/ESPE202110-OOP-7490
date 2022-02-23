
package ec.edu.espe.OilFilter.model;

/**
 *
 * @author JaimeEivar
 */
public class OilFilter {
    
    private int Id;
    float  Weight; 
    private String Mark;
    private String Type;
    private String Maker;

    public OilFilter(int Id, float Weight, String Mark, String Type, String Maker) {
        this.Id = Id;
        this.Weight = Weight;
        this.Mark = Mark;
        this.Type = Type;
        this.Maker = Maker;
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

    public void setType(String Type) {
        this.Type = Type;
    }

    public void setVisa(String Visa) {
        this.Maker = Maker;
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

    public String isType() {
        return Type;
    }

    public String isMaker() {
        return Maker;
    }
    
    
}
