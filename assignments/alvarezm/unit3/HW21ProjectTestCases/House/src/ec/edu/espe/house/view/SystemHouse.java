package ec.edu.espe.house.view;

import java.util.Scanner;
import ec.edu.espe.house.model.AlarmSignal;
import ec.edu.espe.house.model.RemoteControl;
import ec.edu.espe.house.model.Door;
import ec.edu.espe.house.model.House;
import ec.edu.espe.house.model.Light;
import ec.edu.espe.house.model.Room;
import ec.edu.espe.house.model.SoundSystem;
import ec.edu.espe.house.model.Television;
import ec.edu.espe.house.model.User;
import utils.FileManager;

/**
 *
 * @author malvarez, altamiranoc, almachea, andradea, andrangoa
 */
public class SystemHouse {

    public static void main(String[] args) {

        boolean exit = false;
        int option;
        Scanner sc = new Scanner(System.in);
      
        while (!exit) {
            System.out.println("Welcome to the system house");
            System.out.println("What device do you want to control?");
            System.out.println("1. AlarmSignal");
            System.out.println("2. Door");
            System.out.println("3. Ligths");
            System.out.println("4. SoundSystem");
            System.out.println("5. Television");
            System.out.println("6. Exit");
            System.out.println("Write your option: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    String fileName = "data/device.csv";
                    String devices;
                    devices = FileManager.read(fileName);
                    String device;
                    boolean onOff;
                    int id;
                    

                    System.out.println("Welcome, you chose the AlarmSignal menu");
                    while (!exit) {
                        System.out.println("Do you want to turn on AlarmSignal? ");
                        System.out.println("1. Yes ");
                        System.out.println("2. No ");
                        System.out.println("3. Exit");
                        System.out.println("Write your option: ");
                        option =sc.nextInt();

                        switch (option) {
                            case 1:
                                System.out.println("The AlarmSignal will turn on");
                                System.out.println("id --> ");
                                id = sc.nextInt();
                                System.out.println("alarmSignal");
                                System.out.println("Status --> ");
                                onOff = sc.hasNext();
                                System.out.println("List of devices: ");
                                fileName = "data/device.csv";
                                System.out.println(" --> \n " + devices);
                                device = id + ";" + " alarmSignal " + ";" + onOff + "\n";
                                FileManager.save("data/device.csv", device);
                                break;
                            case 2:
                                System.out.println("The AlarmSignal will not turn on");
                                
                                break;
                            case 3:
                                exit = true;
                                System.out.println("Successful, exit");
                                break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("Welcome, you chose the Door menu");
                    while (!exit) {
                        System.out.println("Do you want to open on Door? ");
                        System.out.println("1. Yes ");
                        System.out.println("2. No ");
                        System.out.println("3. Exit");
                        System.out.println("Write your option: ");
                        option = sc.nextInt();
                        switch (option) {
                            case 1:
                                System.out.println("The Door will open");
                                break;
                            case 2:
                                System.out.println("The Door will not open");
                                break;
                            case 3:
                                exit = true;
                                System.out.println("Successful, exit");
                                break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Welcome, you chose the Ligths menu");
                    while (!exit) {
                        System.out.println("Do you want to turn on the Ligths? ");
                        System.out.println("1. Yes ");
                        System.out.println("2. No ");
                        System.out.println("3. Exit");
                        System.out.println("Write your option: ");
                        option = sc.nextInt();
                        switch (option) {
                            case 1:
                                System.out.println("The Ligths will turn on");
                                break;
                            case 2:
                                System.out.println("The Ligths will not turn on");
                                break;
                            case 3:
                                exit = true;
                                System.out.println("Successful, exit");
                                break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Welcome, you chose the SoundSystem menu");
                    while (!exit) {
                        System.out.println("Do you want to turn the SoundSystem on? ");
                        System.out.println("1. Yes ");
                        System.out.println("2. No ");
                        System.out.println("3. Exit");
                        System.out.println("Write your option: ");
                        option = sc.nextInt();
                        switch (option) {
                            case 1:
                                System.out.println("The SoundSystem will turn on");
                                break;
                            case 2:
                                System.out.println("The SoundSystem will not turn on");
                                break;
                            case 3:
                                exit = true;
                                System.out.println("Successful, exit");
                                break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Welcome, you chose the Television menu");
                    while (!exit) {
                        System.out.println("Do you want to turn on the Television? ");
                        System.out.println("1. Yes ");
                        System.out.println("2. No ");
                        System.out.println("3. Exit");
                        System.out.println("Write your option: ");
                        option = sc.nextInt();
                        switch (option) {
                            case 1:
                                System.out.println("The Television will turn on");
                                break;
                            case 2:
                                System.out.println("The Television will not turn on");
                                break;
                            case 3:
                                exit = true;
                                System.out.println("Successful, exit");
                                break;
                        }
                    }
                    break;
                case 6:

                    exit=true;
                    break;
                    default:
                    System.out.println("Choose an option");
                    break;

            }
        }
    }
}
