
package ec.edu.espe.Nba.model;

/**
 *
 * @author TOSHIBA
 */
public class Nba {
    private String name ;
    private String owner ;
    private String coach ;
    private String color ;
    private String stadium ;

    public Nba(String name, String owner, String coach, String color, String stadium) {
        this.name = name;
        this.owner = owner;
        this.coach = coach;
        this.color = color;
        this.stadium = stadium;
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
     * @return the owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * @return the coach
     */
    public String getCoach() {
        return coach;
    }

    /**
     * @param coach the coach to set
     */
    public void setCoach(String coach) {
        this.coach = coach;
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
     * @return the stadium
     */
    public String getStadium() {
        return stadium;
    }

    /**
     * @param stadium the stadium to set
     */
    public void setStadium(String stadium) {
        this.stadium = stadium;
    }
             
       
            
}
