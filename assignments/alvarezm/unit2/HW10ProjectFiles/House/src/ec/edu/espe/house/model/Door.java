package ec.edu.espe.house.model;

/**
 *
 * @author malvarez, altamiranoc, almachea, andradea, andrangoa
 */
public class Door {
    
    private int lenght;
    private int width;
    private String color;
    private int numberOfDoor;
    private String material;
    private boolean open;

    public Door(int i) {
     
    }
    
    private void openDoor() {

    }
    
    private void closeDoor() {

    }    

    public Door(int lenght, int width, String color, int numberOfDoor, String material, boolean open) {
        this.lenght = lenght;
        this.width = width;
        this.color = color;
        this.numberOfDoor = numberOfDoor;
        this.material = material;
        this.open = open;
    }

    
    /**
     * @return the lenght
     */
    public int getLenght() {
        return lenght;
    }

    /**
     * @param lenght the lenght to set
     */
    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
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
     * @return the numberOfDoor
     */
    public int getNumberOfDoor() {
        return numberOfDoor;
    }

    /**
     * @param numberOfDoor the numberOfDoor to set
     */
    public void setNumberOfDoor(int numberOfDoor) {
        this.numberOfDoor = numberOfDoor;
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * @return the open
     */
    public boolean isOpen() {
        return open;
    }

    /**
     * @param open the open to set
     */
    public void setOpen(boolean open) {
        this.open = open;
    }
    
    
    
}
