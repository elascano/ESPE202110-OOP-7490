
package ec.edu.espe.model;

/**
 *
 * @author ASUS
 */
public class Book {
    private String tittle;
    private String autor;
    private String editorial;
    private float price;
    private int year;

    @Override
    public String toString() {
        return "Book{" + "tittle=" + tittle + ", autor=" + autor + ", editorial=" + editorial + ", price=" + price + ", year=" + year + '}';
    }

    public Book(String tittle, String autor, String editorial, float price, int year) {
        this.tittle = tittle;
        this.autor = autor;
        this.editorial= editorial;
        this.price = price;
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
     * @return the editorial
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * @param editorial the editorial to set
     */
    public void setEditorial(String editorial) {
        this.editorial= editorial;
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
