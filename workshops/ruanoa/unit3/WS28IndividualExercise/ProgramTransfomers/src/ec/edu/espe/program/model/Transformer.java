
package ec.edu.espe.program.model;

/**
 *
 * @author Alexander Ruano
 */
public class Transformer {
    private String id;
    private String name;
    private String carModel;
    private Boolean type;
    private String arrivalEarth;

    @Override
    public String toString() {
        return "TransformersObject{" + "id=" + id + ", name=" + name + ", carModel=" + carModel + ", type=" + type + ", arrivalEarth=" + arrivalEarth + '}';
    }

    public Transformer(String id, String name, String carModel, Boolean type, String arrivalEarth) {
        this.id = id;
        this.name = name;
        this.carModel = carModel;
        this.type = type;
        this.arrivalEarth = arrivalEarth;
    }
    

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
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
     * @return the carModel
     */
    public String getCarModel() {
        return carModel;
    }

    /**
     * @param carModel the carModel to set
     */
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    /**
     * @return the type
     */
    public Boolean getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(Boolean type) {
        this.type = type;
    }

    /**
     * @return the arrivalEarth
     */
    public String getArrivalEarth() {
        return arrivalEarth;
    }

    /**
     * @param arrivalEarth the arrivalEarth to set
     */
    public void setArrivalEarth(String arrivalEarth) {
        this.arrivalEarth = arrivalEarth;
    }
    
    
}
