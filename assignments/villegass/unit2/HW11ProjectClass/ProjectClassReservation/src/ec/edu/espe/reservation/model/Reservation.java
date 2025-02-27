/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.reservation.model;

import java.util.Scanner;


/**
 *
 * @author Joel Zeas, Salma Villegas
 */
public class Reservation {

    private String clientName;
    private int phone;
    private String eventName;
    private String date;
    private String paymentMethod;
    private String specs;

    @Override
    public String toString() {
        return "Reservation{" + "clientName=" + clientName + ", phone=" + phone + ", eventName=" + eventName + ", date=" + date + ", paymentMethod=" + paymentMethod + ", specs=" + specs + '}';
    }
 

    public Reservation(String clientName, int phone, String eventName, String date, String paymentMethod, String specs) {

        this.clientName = clientName;
        this.phone = phone;
        this.eventName = eventName;
        this.date = date;
        this.paymentMethod = paymentMethod;
        this.specs = specs;
    }

    public Reservation() {

        System.out.println("\n Reservation ---> ");
        Scanner scanner = new Scanner(System.in);
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

    }

    /**
     * @return the clientName
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * @param clientName the clientName to set
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * @return the phone
     */
    public int getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }

    /**
     * @return the eventName
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * @param eventName the eventName to set
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the paymentMethod
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * @param paymentMethod the paymentMethod to set
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * @return the specs
     */
    public String getSpecs() {
        return specs;
    }

    /**
     * @param specs the specs to set
     */
    public void setSpecs(String specs) {
        this.specs = specs;
    }

}
