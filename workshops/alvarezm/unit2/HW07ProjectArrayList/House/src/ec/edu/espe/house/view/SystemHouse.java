package ec.edu.espe.house.view;


import ec.edu.espe.house.model.Door;
import ec.edu.espe.house.model.House;
import ec.edu.espe.house.model.Light;
import ec.edu.espe.house.model.Room;
import ec.edu.espe.house.model.SoundSystem;
import ec.edu.espe.house.model.Television;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mealvarez
 */
public class SystemHouse {
    static Scanner scanner = new Scanner(System.in); 
    static int select = -1; 
    public static void main(String[] args) {
        int doorId = 0;
        int lightId = 0;
        int televisionId;
        int soundSystemId = 0;
        int roomId ;
        boolean alarmSignal = false;
          
                
        ArrayList <Room> rooms = new ArrayList<>() ;
        ArrayList <SoundSystem> soundSystems =new ArrayList<>();
        ArrayList <Television> televisions =new ArrayList<>();
        ArrayList <Light> lights = new ArrayList<>();
        ArrayList <Door> doors = new ArrayList<>();
        Room room;
        House house;
        Light light = null;
        Door door = null;
        SoundSystem soundSystem;
        Television television = null;
         

        
        
    while(select != 0){
        
    try{
    System.out.println("*****Welcome to the Inteligent House******");
    System.out.println("PRINCIPAL MENU OF THE HOUSE");
    System.out.println("1----Status Room ID----");
    System.out.println("2----Status SoundSystem----");
    System.out.println("3----Close the system----");
    System.out.println("4----Alarm Signal----");
    System.out.println("5----Add Ids----");
    System.out.println("0-----Exit----");
    
    select = Integer.parseInt(scanner.nextLine()); 
              
    switch(select){
        case 1:             
         
        break;
        
        case 2:
            
        break;
        
        case 3:
            
        break;  
        
        case 4:
           
        
        break;
        
        case 5:
            System.out.println("Add rooms");
            Scanner add = new Scanner(System.in);
            System.out.println("- Id  --> ");
            roomId = add.nextInt();
            System.out.println("Light Id:");
            lightId= add.nextInt();
            System.out.println("Door Id:");
            doorId= add.nextInt();
            room = new Room(roomId, roomId, lightId, doorId, televisions, lights, doors);
            house = new House(roomId, soundSystemId, alarmSignal, rooms, soundSystems);
            rooms.add(room);
            televisions.add(television);
            lights.add(light);
            doors.add(door);
            System.out.println("Room --> " + room ); 
            System.out.println("House --> " + house );
            
        break;    
            
        case 0:
            
        default:
    System.out.println("Try again");
    break;
   }
      
    System.out.println("\n"); 
      
            }catch(NumberFormatException e){    
        
           }
    
}
         }
    }
