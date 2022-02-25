
package ec.edu.espe.Country.model;

/**
 *
 * @author JaimeEivarEaxam
 */
public class Country {
    private String Name;
    private String Culture; 
    private int ZipCode;
    private String Location;
    private boolean Visa;

    public Country(String Name, String Culture, int ZipCode, String Location, boolean Visa) {
        this.Name = Name;
        this.Culture = Culture;
        this.ZipCode = ZipCode;
        this.Location = Location;
        this.Visa = Visa;
    }

    public String getName() {
        return Name;
    }

    public String getCulture() {
        return Culture;
    }

    public int getZipCode() {
        return ZipCode;
    }

    public String getLocation() {
        return Location;
    }

    public boolean isVisa() {
        return Visa;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setCulture(String Culture) {
        this.Culture = Culture;
    }

    public void setZipCode(int ZipCode) {
        this.ZipCode = ZipCode;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public void setVisa(boolean Visa) {
        this.Visa = Visa;
    }
    
    

}
