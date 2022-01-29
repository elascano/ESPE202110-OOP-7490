package ec.edu.espe.tool.model;

/**
 *
 * @author Andrea Tapia
 */
public class Tool {

    private int id;
    private String name;
    private String type;
    private String group;
    private float price;

    public Tool(int id, String name, String type, String group, float price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.group = group;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
