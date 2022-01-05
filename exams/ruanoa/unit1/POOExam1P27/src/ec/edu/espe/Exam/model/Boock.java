package ec.edu.espe.Exam.model;

/**
 *
 * @author Alexander Ruano
 */
public class Boock {

    private String tittle;
    private String autor;
    private String planeta;
    private float prize;
    private int year;

    private void add() {
        System.out.println("This chicken is clucking .....");

    }

    @Override
    public String toString() {
        return "Boock{" + "tittle=" + tittle + ", autor=" + autor + ", planeta=" + planeta + ", price=" + price + ", year=" + year + '}';
    }

    public Boock(String tittle, String autor, String planeta, float price, int year) {
        this.tittle = tittle;
        this.autor = autor;
        this.planeta = planeta;
        this.prize = price;
        this.year = year;
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
        return prize;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.prize = price;
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
