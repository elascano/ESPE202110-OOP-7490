
package ec.edu.espe.smart.empleoyes.model;
       

/**
 *
 * @author Mateo Landazuri OOP
 */
public class Empleoyes {

    @Override
    public String toString() {
        return "Empleoyes{" + "ID=" + ID + ", WORKAREA=" + WORKAREA + ", NAME=" + NAME + ", AGE=" + AGE + ", PHONE=" + PHONE + '}';
    }

   
    private int ID;
    private String WORKAREA;
    private String NAME;
    private boolean AGE;
    private int PHONE;
    
    public int getID() {
        return ID;
    }

    public String getWORKAREA() {
        return WORKAREA;
    }

    public String getNAME() {
        return NAME;
    }

    public boolean isAGE() {
        return AGE;
    }

    public int getPHONE() {
        return PHONE;
    }
    
    

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setWORKAREA(String WORKAREA) {
        this.WORKAREA = WORKAREA;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public void setAGE(boolean AGE) {
        this.AGE = AGE;
    }

    public void setPHONE(int PHONE) {
        this.PHONE = PHONE;
    }

       
        public Empleoyes(int ID, String WORKAREA, String NAME, boolean AGE, int PHONE) {
        this.ID = ID;
        this.WORKAREA = WORKAREA;
        this.NAME = NAME;
        this.AGE = AGE;
        this.PHONE = PHONE;
    }
  
    
    public Empleoyes(){
        
    }

   

    
    
    /* Transformo un objecto que me da MongoDB a un Objecto Java
	public Empleoyes(BasicDBObject dBObjectHouse) {
		this.Id = dBObjectHouse.getString("Id");
		this.WORKAREA = dBObjectHouse.getString("Color");
		this.NAME = dBObjectHouse.getInt("Ubication");

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

    
}
