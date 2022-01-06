package ec.edu.espe.warehouse.model;

/**
 *
 * @author Javier Paucar
 */
public class Weapon {

    private int id;
    private int yearFabrication;
    private String name;
    private String caliber;
    private String status;

    @Override
    public String toString() {
        return "Weapon{" + "id=" + id + ", yearFabrication=" + yearFabrication + ", name=" + name + ", caliber=" + caliber + ", status=" + status + '}';
    }

    public Weapon(int id, int yearFabrication, String name, String caliber, String status) {
        this.id = id;
        this.yearFabrication = yearFabrication;
        this.name = name;
        this.caliber = caliber;
        this.status = status;
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
     * @return the caliber
     */
    public String getCaliber() {
        return caliber;
    }

    /**
     * @param caliber the caliber to set
     */
    public void setCaliber(String caliber) {
        this.caliber = caliber;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the yearFabrication
     */
    public int getYearFabrication() {
        return yearFabrication;
    }

    /**
     * @param yearFabrication the yearFabrication to set
     */
    public void setYearFabrication(int yearFabrication) {
        this.yearFabrication = yearFabrication;
    }

}
