
package ec.edu.espe.house.model;

/**
 *
 * @author mealvarez
 */
public class AlarmSignal {
   private boolean alarmSignal = false;

    @Override
    public String toString() {
        return "AlarmSignal{" + "alarmSignal=" + alarmSignal + '}';
    }

    public AlarmSignal() {
    }

    /**
     * @return the alarmSignal
     */
    public boolean isAlarmSignal() {
        return alarmSignal;
    }

    /**
     * @param alarmSignal the alarmSignal to set
     */
    public void setAlarmSignal(boolean alarmSignal) {
        this.alarmSignal = alarmSignal;
    }
   
   
}
