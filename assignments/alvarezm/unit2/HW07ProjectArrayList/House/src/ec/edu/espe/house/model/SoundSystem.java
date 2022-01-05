
package ec.edu.espe.house.model;

/**
 *
 * @author mealvarez
 */
public class SoundSystem {
    private int soundSystemId;
    private boolean statusSoundSystem;

    public SoundSystem(int soundSystemId, boolean statusSoundSystem) {
        this.soundSystemId = soundSystemId;
        this.statusSoundSystem = statusSoundSystem;
    }

    @Override
    public String toString() {
        return "SoundSystem{" + "soundSystemId=" + soundSystemId + ", statusSoundSystem=" + statusSoundSystem + '}';
    }

    /**
     * @return the soundSystemId
     */
    public int getSoundSystemId() {
        return soundSystemId;
    }

    /**
     * @param soundSystemId the soundSystemId to set
     */
    public void setSoundSystemId(int soundSystemId) {
        this.soundSystemId = soundSystemId;
    }

    /**
     * @return the statusSoundSystem
     */
    public boolean isStatusSoundSystem() {
        return statusSoundSystem;
    }

    /**
     * @param statusSoundSystem the statusSoundSystem to set
     */
    public void setStatusSoundSystem(boolean statusSoundSystem) {
        this.statusSoundSystem = statusSoundSystem;
    }
    
    
}
