package ec.edu.espe.farm.model;

/**
 *
 * @author Joel Zeas
 */
public class Chicken extends NewClass{
    private boolean isMolting;

    public Chicken(boolean isMolting) {
        this.isMolting = isMolting;
    }

    
    /**
     * @return the isMolting
     */
    public boolean isIsMolting() {
        return isMolting;
    }

    /**
     * @param isMolting the isMolting to set
     */
    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    
}
