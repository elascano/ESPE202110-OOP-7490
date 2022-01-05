
package ec.edu.espe.house.model;

/**
 *
 * @author mealvarez
 */
public class Television {
    private int tvId;
    private boolean statusTv;

    @Override
    public String toString() {
        return "Television{" + "tvId=" + tvId + ", statusTv=" + statusTv + '}';
    }

    public Television(int tvId, boolean statusTv) {
        this.tvId = tvId;
        this.statusTv = statusTv;
    }

    /**
     * @return the tvId
     */
    public int getTvId() {
        return tvId;
    }

    /**
     * @param tvId the tvId to set
     */
    public void setTvId(int tvId) {
        this.tvId = tvId;
    }

    /**
     * @return the statusTv
     */
    public boolean isStatusTv() {
        return statusTv;
    }

    /**
     * @param statusTv the statusTv to set
     */
    public void setStatusTv(boolean statusTv) {
        this.statusTv = statusTv;
    }

    
}
