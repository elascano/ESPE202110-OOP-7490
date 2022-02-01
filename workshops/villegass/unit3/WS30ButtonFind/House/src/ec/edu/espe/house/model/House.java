
package ec.edu.espe.house.model;
       

/**
 *
 * @author Salma Villegas
 */
public class House {

    private int Id;
    private String color;
    private String ubication;
    private boolean roomsNumber;
    private int size;
    private int price;
    
    public House(){
        
    }

    @Override
    public String toString() {
        return "House{" + "Id=" + getId() + ", color=" + getColor() + ", ubication=" + getUbication() + ", roomsNumber=" + isRoomsNumber() + ", size=" + getSize() + ", price=" + getPrice() + '}';
    }

    public House(int Id, String color, String ubication, boolean roomsNumber, int size, int price) {
        this.Id = Id;
        this.color = color;
        this.ubication = ubication;
        this.roomsNumber = roomsNumber;
        this.size = size;
        this.price = price;
    }
    
    
    /* Transformo un objecto que me da MongoDB a un Objecto Java
	public House(BasicDBObject dBObjectHouse) {
		this.Id = dBObjectHouse.getString("Id");
		this.color = dBObjectHouse.getString("Color");
		this.ubication = dBObjectHouse.getInt("Ubication");

		// Cuidado cuando trabajamos con Arrays o Listas
		BasicDBList listDemarcaciones = (BasicDBList) dBObjectFutbolista.get("demarcacion");
		this.demarcacion = new ArrayList<String>();
		for (Object demarc : listDemarcaciones) {
			this.demarcacion.add(demarc.toString());
		}

		this.internacional = dBObjectHouse.getBoolean("internacional");
	}

	public BasicDBObject toDBObjectHouse() {

		// Creamos una instancia BasicDBObject
		BasicDBObject dBObjectHouse = new BasicDBObject();

		dBObjectHouse.append("Id", this.getNombre());
		dBObjectHouse.append("Color", this.getApellidos());
		dBObjectHouse.append("Ubication", this.getEdad());
		dBObjectHouse.append("Rooms Number", this.getDemarcacion());
		dBObjectHouse.append("Size", this.getInternacional());
                dBObjectHouse.append("Price", this.getInternacional());

		return dBObjectHouse;
	}*/

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
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
     * @return the ubication
     */
    public String getUbication() {
        return ubication;
    }

    /**
     * @param ubication the ubication to set
     */
    public void setUbication(String ubication) {
        this.ubication = ubication;
    }

    /**
     * @return the roomsNumber
     */
    public boolean isRoomsNumber() {
        return roomsNumber;
    }

    /**
     * @param roomsNumber the roomsNumber to set
     */
    public void setRoomsNumber(boolean roomsNumber) {
        this.roomsNumber = roomsNumber;
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
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }
    
    

}
