
package ec.edu.espe.tire.model;

/**
 *
 * @author WorksBotsTeam
 */
public class Time {

    private int day;
    private int month;
    private int year;
    
    public Time(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Time() {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Time(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    public void buy(){
    
    }
    
    public void sell(){
        
    }

    public void stock(){
       
    }
}
