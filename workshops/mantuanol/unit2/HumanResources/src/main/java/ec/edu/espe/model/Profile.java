package ec.edu.espe.model;

public class Profile {

    private String name;
    private int id;
    private String areawork;
    private int password;

    @Override
    public String toString() {
        return "Profile{" + "name=" + name + ", id=" + id + ", areawork=" + areawork + ", password=" + password + '}';
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getAreawork() {
        return areawork;
    }

    public int getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAreawork(String areawork) {
        this.areawork = areawork;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Profile(String name, int id, String areawork, int password) {
        this.name = name;
        this.id = id;
        this.areawork = areawork;
        this.password = password;
    }
    
public void profile () {
        
    }
    
}
