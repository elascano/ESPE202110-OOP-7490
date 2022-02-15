
package ec.edu.espe.bankingplan;

/**
 *
 * @author Camila Teca, DEEE-ESPE
 */
public class RegisterProfile {
    public String register(String name, String lastname, int id, int age, String password){
        String user;
        user = name +""+ lastname +""+ id +""+ age +""+ password;
        return user;
    }
}
