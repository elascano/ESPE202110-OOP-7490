
package ec.edu.espe.smart.model;

/**
 *
 * @author Benjamin Cadena OOPTech ESPE-DCCO
 */
public class Coffee {
     private String name;
     private String aroma;
     private String acidity;
     private String bitterness;
     private String color;
     private String texture;
     private String cream;

    @Override
    public String toString() {
        return "Coffee{" + "name=" + name + ", aroma=" + aroma + ", acidity=" + acidity + ", bitterness=" + bitterness + ", color=" + color + ", texture=" + texture + ", cream=" + cream + '}';
    }

    public Coffee(String name, String aroma, String acidity, String bitterness, String color, String texture, String cream) {
        this.name = name;
        this.aroma = aroma;
        this.acidity = acidity;
        this.bitterness = bitterness;
        this.color = color;
        this.texture = texture;
        this.cream = cream;
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
     * @return the aroma
     */
    public String getAroma() {
        return aroma;
    }

    /**
     * @param aroma the aroma to set
     */
    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    /**
     * @return the acidity
     */
    public String getAcidity() {
        return acidity;
    }

    /**
     * @param acidity the acidity to set
     */
    public void setAcidity(String acidity) {
        this.acidity = acidity;
    }

    /**
     * @return the bitterness
     */
    public String getBitterness() {
        return bitterness;
    }

    /**
     * @param bitterness the bitterness to set
     */
    public void setBitterness(String bitterness) {
        this.bitterness = bitterness;
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
     * @return the texture
     */
    public String getTexture() {
        return texture;
    }

    /**
     * @param texture the texture to set
     */
    public void setTexture(String texture) {
        this.texture = texture;
    }

    /**
     * @return the cream
     */
    public String getCream() {
        return cream;
    }

    /**
     * @param cream the cream to set
     */
    public void setCream(String cream) {
        this.cream = cream;
    }
     
}
