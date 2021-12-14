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
 * @author grupo1
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
    System.out.println("=======Welcome User=======");
    System.out.println("PRINCIPAL MENU OF CONTROL HOUSE");
    System.out.println("1----Status Room ID----");
    System.out.println("2----Status SoundSystem----");
    System.out.println("3----OFF/CLOSE all system----");
    System.out.println("4----Alarm Signal----");
    System.out.println("5----Data Base----");
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
            System.out.println("add rooms");
            Scanner add = new Scanner(System.in);
            System.out.println("- id  --> ");
            roomId = add.nextInt();
            System.out.println("light id :");
            lightId= add.nextInt();
            System.out.println("door id  :");
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
    System.out.println("try again");break;
   }
      
    System.out.println("\n"); 
      
            }catch(NumberFormatException e){    
        
        
    }
    
}
         }
    }
