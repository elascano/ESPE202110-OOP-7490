
package ec.edu.espe.cbook.service;

import ec.edu.espe.cbook.model.Contact;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel Lincano
 */
public class ContactsService {

    public static List<Contact> contactList = new ArrayList<Contact>();

    public void grabar(Contact contact) throws Exception {

        if (contact.getId() == null) {
            throw new Exception("No se puede grabar con Nombre vacio");

        }
        if (contact.getName() == null || contact.getName().isEmpty()) {
            throw new Exception("No se puede grabar con Nombre vacio");
        }
        if (contact.getHobby() == null || contact.getHobby().isEmpty()) {
            throw new Exception("No se puede grabar con Nombre vacio");

        }
        if (contact.getCellPhoneNumber() == null || contact.getCellPhoneNumber().isEmpty()) {
            throw new Exception("No se puede grabar con Nombre vacio");

        }
        if (contact.getComments() == null || contact.getComments().isEmpty()) {
            throw new Exception("No se puede grabar con Nombre vacio");

        }

        contactList.add(contact);
    }

    public void eliminar(int filaEliminar) {
        contactList.remove(filaEliminar);
    }

    public List<Contact> obtenerTodos() {
        return contactList;
    }

}
