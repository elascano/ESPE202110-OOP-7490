package ec.edu.espe.bank.model;

import ec.edu.espe.bank.view.FrmRegister;
import javax.swing.JFrame;

/**
 *
 * @author Camila Teca, DEEE-ESPE
 */
public class RegisterSingleton {

    private static JFrame registration;

    private RegisterSingleton() {
    }

    public static JFrame getInstance() {
        if (registration == null) {
            registration = new FrmRegister();
        }
        return registration;
    }
}
