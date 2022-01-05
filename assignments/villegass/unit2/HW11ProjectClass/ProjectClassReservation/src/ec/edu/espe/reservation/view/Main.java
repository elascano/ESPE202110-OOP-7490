
package ec.edu.espe.reservation.view;
import com.google.gson.Gson;
import ec.edu.espe.reservation.model.Reservation;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import utils.FileManager;

/**
 *
 * @author Salma Villegas
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("List of reservations from my home in jason format");
        ArrayList<String> reservations = new ArrayList<>();
        String fileName = "data/reservation.json";
        reservations = FileManager.read(fileName);
        System.out.println(" --> RESERVATION \n" + reservations);   
        
       
        System.out.println("\n Reservation ---> ");
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter Client name ");
        String clientName = scanner.next();
        System.out.println(" Enter phone to client ");
        int phone = scanner.nextInt();
        System.out.println(" Enter event name ");
        String eventName = scanner.next();
        System.out.println(" Enter date ");
        String date = scanner.next();
        System.out.println(" Enter Payment Method ");
        String paymentMethod = scanner.next();
        System.out.println(" Enter specs ");
        String specs = scanner.next();  

        Reservation reservation;
        reservation= new Reservation (clientName, phone, eventName, date, paymentMethod, specs);
 
        Gson gson;
        gson = new Gson();

        String jsonDevice= gson.toJson(reservation);
        FileManager.save(fileName, jsonDevice);
        
        ArrayList<Reservation> reservationsList = new ArrayList<>();
        
        reservations = new ArrayList<>();
        fileName = "data/reservation.json";
        reservations = FileManager.read(fileName);
        System.out.println(" --> DEVICES \n "+ reservations);
        
        for(String reservationString : reservations){
            System.out.println("reservation String --> " + reservationString + " <--");
            reservationsList.add(reservation);
            reservation = gson.fromJson(reservationString, Reservation.class);
            System.out.println("device id -> " + reservation.getClientName());
            
        }

        System.out.println("The ArrayList of Reservations is [][][][][] \n ");
        System.out.println(reservationsList);
        
        String reservationsListJson;
        reservationsListJson = gson.toJson(reservationsList);
        System.out.println("The json array created using gson library is -> ");
        System.out.println(reservationsListJson);
        
    }
    
}
