package ec.edu.espe.simulationcatering.view;

import ec.edu.espe.simulationcatering.model.Cookware;
import ec.edu.espe.simulationcatering.model.Event;
import ec.edu.espe.simulationcatering.model.Ingredient;
import ec.edu.espe.simulationcatering.model.Menu;
import ec.edu.espe.simulationcatering.model.Reservation;
import ec.edu.espe.simulationcatering.model.Transport;
import ec.edu.espe.simulationcatering.model.Worker;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Melanie Joel Salma
 */
public class SimulationProjectCatering {

    public static void main(String[] args) {
        System.out.println("HW07ProjectArrayList --> Melanie Terán <--");
        Cookware cookware;
        Event event;
        Ingredient ingredient;
        Menu menu;
        Reservation reservation;
        Transport transport;
        Worker worker;

        ArrayList<Cookware> cookwares = new ArrayList<>();
        ArrayList<Transport> transports = new ArrayList<>();
        ArrayList<Menu> menus = new ArrayList<>();
        ArrayList<Worker> workers = new ArrayList<>();
        ArrayList<Ingredient> ingredients = new ArrayList<>();

        int code;
        String name;
        String material;
        String use;
        String disponibility;
        int quantity;
        int productCode;
        float price;
        String description;
        float weight;
        String supplier;
        int phone;
        String specialization;
        String components;
        int menuCode;
        String date;
        String place;
        String hour;
        int guests;
        String driverName;
        String enrollment;
        String typeTransport;
        int freightCapacity;
        String destination;
        int travelTime;
        int gallonsgasoline;
        String fuel;
        String clientName;
        String eventName;
        String paymentMethod;
        String specs;
        boolean continuee = true;

        Scanner scanner = new Scanner(System.in);
        Scanner getInput = new Scanner(System.in);

//Reservation
        System.out.println("\n Reservation ---> ");
        System.out.println(" Enter Client name ");
        clientName = scanner.next();
        System.out.println(" Enter phone to client ");
        phone = scanner.nextInt();
        System.out.println(" Enter event name ");
        eventName = scanner.next();
        System.out.println(" Enter date ");
        date = scanner.next();
        System.out.println(" Enter Payment Method ");
        paymentMethod = scanner.next();
        System.out.println(" Enter specs ");
        specs = scanner.next();
        reservation = new Reservation(clientName, 0, eventName, date, paymentMethod, specs);

//Event
        System.out.println("\n Event Detail ");
        System.out.println(" Date ");
        date = scanner.next();
        System.out.println(" Place ");
        place = scanner.next();
        System.out.println(" Hour ");
        hour = scanner.next();
        System.out.println(" Guests ");
        guests = scanner.nextInt();
        event = new Event(date, place, hour, guests, transports, menus, workers);

//Transport
        while (continuee) {
            System.out.println("\n Details of the transport ");
            System.out.println(" Driver Name");
            driverName = scanner.next();
            System.out.println(" Enrollment ");
            enrollment = scanner.next();
            System.out.println(" Type of transport ");
            typeTransport = scanner.next();
            System.out.println(" Freight Capacity ");
            freightCapacity = scanner.nextInt();
            System.out.println(" Destination ");
            destination = scanner.next();
            System.out.println(" Travel Time ");
            travelTime = scanner.nextInt();
            System.out.println(" Gallons of Gasoline ");
            gallonsgasoline = scanner.nextInt();
            System.out.println(" Fuel ");
            fuel = scanner.next();

            transport = new Transport(driverName, enrollment, typeTransport, freightCapacity, destination, travelTime, gallonsgasoline, fuel);
            event.add(transport);

            System.out.print("\nDo you want to enter another transport ");
            System.out.println("Y / N ");

            String opc = getInput.next();

            if (opc.equals("y") || opc.equals("Y")) {
                continuee = true;
            } else {
                continuee = false;
            }
            System.out.println("\n " + transport);
        }
        continuee = true;

//Menu
        while (continuee) {
            System.out.println("\n Menu ---> ");
            System.out.println(" Enter the name of the menu ");
            name = scanner.next();
            System.out.println(" Enter components ");
            components = scanner.next();
            System.out.println(" Enter price  ");
            price = scanner.nextInt();
            System.out.println(" Number to menu  ");
            description = scanner.next();
            System.out.println(" Enter code to menu  ");
            menuCode = scanner.nextInt();

            menu = new Menu(name, components, 0, description, 0, ingredients);
            event.add(menu);

            System.out.print("\nDo you want to enter another menu ");
            System.out.println("Y / N ");

            String opc = getInput.next();

            if (opc.equals("y") || opc.equals("Y")) {
                continuee = true;
            } else {
                continuee = false;
            }
            System.out.println("\n " + menu);
            continuee = true;

// Ingredients
            while (continuee) {
                System.out.println("\n Details of the ingredients ");
                System.out.println(" ProductCode ");
                productCode = scanner.nextInt();
                System.out.println(" Quantity ");
                quantity = scanner.nextInt();
                System.out.println(" Price ");
                price = scanner.nextFloat();
                System.out.println(" Description ");
                description = scanner.next();
                System.out.println(" weight ");
                weight = scanner.nextFloat();
                System.out.println(" Supplier ");
                supplier = scanner.next();

                ingredient = new Ingredient(0, 0, 0, description, 0, supplier);
                menu.add(ingredient);

                System.out.print("\nDo you want to enter another ingradient ");
                System.out.println("Y / N ");

                opc = getInput.next();

                if (opc.equals("y") || opc.equals("Y")) {
                    continuee = true;
                } else {
                    continuee = false;
                }
                System.out.println("\n " + ingredient);

            }
        }
        continuee = true;
//Worker
        while (continuee) {
            System.out.println("\n List of Workers");
            System.out.println(" Name ");
            name = scanner.next();
            System.out.println(" Phone ");
            phone = scanner.nextInt();
            System.out.println(" Specialization ");
            specialization = scanner.next();
            worker = new Worker(name, 0, specialization, cookwares);

            event.add(worker);

            System.out.print("\nDo you want to enter another worker ");
            System.out.println("Y / N ");

            String opc = getInput.next();

            if (opc.equals("y") || opc.equals("Y")) {
                continuee = true;
            } else {
                continuee = false;
            }
            System.out.println("\n " + worker);
            continuee = true;
            //cookware
            while (continuee) {
                System.out.println("\n Details of the cookware ");
                System.out.println(" Code ");
                code = scanner.nextInt();
                System.out.println(" Name ");
                name = scanner.next();
                System.out.println(" Material ");
                material = scanner.next();
                System.out.println(" Use ");
                use = scanner.next();
                System.out.println(" Disponibility ");
                disponibility = scanner.next();
                System.out.println(" Quantity ");
                quantity = scanner.nextInt();

                cookware = new Cookware(0, name, material, use, disponibility, quantity);
                worker.add(cookware);

                System.out.print("\nDo you want to enter another cookware ");
                System.out.println("Y / N ");
                
                opc = getInput.next();

                if (opc.equals("y") || opc.equals("Y")) {
                    continuee = true;
                } else {
                    continuee = false;
                }
                System.out.println("\n " + cookware);
            }
        }
    }

}
