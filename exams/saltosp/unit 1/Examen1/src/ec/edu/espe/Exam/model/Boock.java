package ec.edu.espe.Exam.model;

/**
 *
 * @author Paul Saltos
 */
public class Boock {
    
   private String tittle;
   private String autor;
   private String planeta;
   private float price;
   private int yearOfinterest;

    public Boock(String tittle, String autor, String planeta, float price, int yearOfinterest) {
        this.tittle = tittle;
        this.autor = autor;
        this.planeta = planeta;
        this.price = price;
        this.yearOfinterest = yearOfinterest;
    }

    @Override
    public String toString() {
        return "Boock{" + "tittle=" + getTittle() + ", autor=" + getAutor() + ", planeta=" + getPlaneta() + ", price=" + getPrice() + ", yearOfinterest=" + getYearOfinterest() + '}';
    }

    /**
     * @return the tittle
     */
    public String getTittle() {
        return tittle;
    }

    /**
     * @param tittle the tittle to set
     */
    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the planeta
     */
    public String getPlaneta() {
        return planeta;
    }

    /**
     * @param planeta the planeta to set
     */
    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the yearOfinterest
     */
    public int getYearOfinterest() {
        return yearOfinterest;
    }

    /**
     * @param yearOfinterest the yearOfinterest to set
     */
    public void setYearOfinterest(int yearOfinterest) {
        this.yearOfinterest = yearOfinterest;
    }

    
   
    
}

