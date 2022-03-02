package ec.edu.espe.bank.model;

/**
 *
 * @author RocketTeam
 */
public class Profile {

    private String name;
    private int birthDate;
    private int id;
    private int password;

    public Profile(String name, int birthDate, int id, int password) {
        this.name = name;
        this.birthDate = birthDate;
        this.id = id;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Profile{" + "name=" + name + ", birthDate=" + birthDate + ", id=" + id + ", password=" + password + '}';
    }

    public void changePassword() {

    }

    public Account createAccount() {
        return new Account();
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
     * @return the birthDate
     */
    public int getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the password
     */
    public int getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(int password) {
        this.password = password;
    }

}
