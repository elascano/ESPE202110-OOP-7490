
package ec.edu.espe.smixer.model;

/**
 *
 * @author Anthony Morales
 */
public class SoundMixer {
    private int id;
    private String brand;
    private String type;
    private float price;
    private String integratedWifi;
    private String soundQuality;

    public SoundMixer(int id, String brand, String type, float price, String integratedWifi, String soundQuality) {
        this.id = id;
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.integratedWifi = integratedWifi;
        this.soundQuality = soundQuality;
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
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the integratedWifi
     */
    public String getIntegratedWifi() {
        return integratedWifi;
    }

    /**
     * @param integratedWifi the integratedWifi to set
     */
    public void setIntegratedWifi(String integratedWifi) {
        this.integratedWifi = integratedWifi;
    }

    /**
     * @return the soundQuality
     */
    public String getSoundQuality() {
        return soundQuality;
    }

    /**
     * @param soundQuality the soundQuality to set
     */
    public void setSoundQuality(String soundQuality) {
        this.soundQuality = soundQuality;
    }
}
