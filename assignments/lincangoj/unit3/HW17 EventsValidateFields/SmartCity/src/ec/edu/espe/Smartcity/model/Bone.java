
package ec.edu.espe.Smartcity.model;

/**
 *
 * @author Daniel Lincango
 */
public class Bone {
    private int size;
    private String boneType;
    private String Funtion;
    private String name;
    private String boneBelongs;
    private String date;

    public Bone(int size, String boneType, String Funtion, String name, String boneBelongs, String date) {
        this.size = size;
        this.boneType = boneType;
        this.Funtion = Funtion;
        this.name = name;
        this.boneBelongs = boneBelongs;
        this.date =date ;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the boneType
     */
    public String getBoneType() {
        return boneType;
    }

    /**
     * @param boneType the boneType to set
     */
    public void setBoneType(String boneType) {
        this.boneType = boneType;
    }

    /**
     * @return the Funtion
     */
    public String getFuntion() {
        return Funtion;
    }

    /**
     * @param Funtion the Funtion to set
     */
    public void setFuntion(String Funtion) {
        this.Funtion = Funtion;
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
     * @return the boneBelongs
     */
    public String getBoneBelongs() {
        return boneBelongs;
    }

    /**
     * @param boneBelongs the boneBelongs to set
     */
    public void setBoneBelongs(String boneBelongs) {
        this.boneBelongs = boneBelongs;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

 
   



    
    
}
