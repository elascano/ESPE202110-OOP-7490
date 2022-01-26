
package ec.edu.espe.Vehicles.model;

/**
 *
 * @author mayer
 */
public class Vehicles {
    private int id;
    private String Color;
    private String Model;
    private int Year;
    private String TradeMark;         

    public Vehicles(int id, String Color, String Model, int Year, String TradeMark) {
        this.id = id;
        this.Color = Color;
        this.Model = Model;
        this.Year = Year;
        this.TradeMark = TradeMark;
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

    /**
     * @return the Year
     */
    public int getYear() {
        return Year;
    }

    /**
     * @param Year the Year to set
     */
    public void setYear(int Year) {
        this.Year = Year;
    }

    /**
     * @return the TradeMark
     */
    public String getTradeMark() {
        return TradeMark;
    }

    /**
     * @param TradeMark the TradeMark to set
     */
    public void setTradeMark(String TradeMark) {
        this.TradeMark = TradeMark;
    }
}

