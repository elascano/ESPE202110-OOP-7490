
package ec.edu.espe.book.controller;

/**
 *
 * @author darling.cruz
 */
public class YearOfPublication {
    
    private int year;

    @Override
    public String toString() {
        return "YearOfPublication{" + "year=" + year + '}';
    }
   
    
    
    public YearOfPublication( ) {
        year = 0;
    }

    public YearOfPublication(int year) {
        this.year = year;
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
    
    
}
