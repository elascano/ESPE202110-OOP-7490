
package ec.edu.espe.warehouse.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author José
 */
public class Weapon {
    private int id;
    private String description;
    private String type;
    private boolean status; // true  if the device is operble, false if the devoce is not operable
    private int ammunition;

    
    public Weapon(int id, String description, String type, boolean status, int ammunition) {
        this.id = id;
        this.description = description;
        this.type = type;
        this.status = status;
        this.ammunition = ammunition;
    }

    public Weapon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        public void AddWeapons() throws IOException {
    		
    	BufferedWriter bw = new BufferedWriter( new FileWriter("weapon.csv",true) );
    	Scanner read = new Scanner(System.in);
    	String id, description, type, status,ammunition;
                
    	System.out.print("Enter id of weapon: ");
    	id = read.nextLine();
    	System.out.print("Enter Description of weapon: ");
    	description = read.nextLine();
    	System.out.print("Enter type of weapon: ");
    	type = read.nextLine();
    	System.out.print("Enter status of weapon: ");  		
    	status = read.nextLine();
        System.out.print("Enter ammunition of weapon: ");  		
    	ammunition = read.nextLine();
        
                
    	bw.write(id+";"+description+";"+type+";"+status+";"+ammunition);
    	bw.flush();
    	bw.newLine();
    	bw.close();
    }

public void ViewAllWeapons() throws IOException {
        try (BufferedReader br = new BufferedReader( new FileReader("weapon.csv") )) {
            String record;
            System.out.println(" ------------------------------------------------------------- ");
            System.out.println("|	ID	Description 	  type 	  status    ammunition     |");
            System.out.println(" ------------------------------------------------------------- ");
            
            while( ( record = br.readLine() ) != null ) {
                
                StringTokenizer st = new StringTokenizer(record,";");
                System.out.println("|	"+st.nextToken()+"	"+st.nextToken()+" 		"+st.nextToken()+"		"+st.nextToken()+"        |");
                
            }
            System.out.println("|	                                            	          |");
            System.out.println(" ------------------------------------------------------------- ");
        }	
    } 
    public void DeleteWeapons() throws IOException {
    	Scanner read =  new Scanner(System.in);
    	String id, record;
    		
    	File tempDB = new File("weapon.csv");
    	File db = new File("weapon.csv");
    		
        BufferedWriter bw;
        try (BufferedReader br = new BufferedReader( new FileReader( db ) )) {
            bw = new BufferedWriter( new FileWriter( tempDB ) );
            System.out.println("\t\t Delete weapon on CSV\n");
            System.out.println("Enter ID the weapon: ");
            id =  read.nextLine();
            while( ( record = br.readLine() ) != null ) {
                if( record.contains(id) )
                    continue;
                bw.write(record);
                bw.flush();
                bw.newLine();
            }
        }
            bw.close();
            //db.delete();
            tempDB.renameTo(db);
    }

    public void SearchWeaponID() throws IOException {
    	String id,record;
    	Scanner read = new Scanner(System.in);
    		
        try (BufferedReader br = new BufferedReader( new FileReader("weapon.csv") )) {
            System.out.println("\t\t Search weapon CSV\n");
            
            System.out.println("Enter ID weapon: ");
            id = read.nextLine();
            
            System.out.println(" ------------------------------------------------------------- ");
            System.out.println("|	ID	Description 	  type 	  status    ammunition	  |");
            System.out.println(" ------------------------------------------------------------- ");
            while( ( record = br.readLine() ) != null ) {
                StringTokenizer st = new StringTokenizer(record,";");
                if( record.contains(id) ) {
                    System.out.println("|	"+st.nextToken()+"	"+st.nextToken()+" 		"+st.nextToken()+"			"+st.nextToken()+"      |");
                }
            }
            System.out.println("|	                                            	          |");
            System.out.println(" ------------------------------------------------------------- ");
        }
    }

    public void updateWeaponID() throws IOException {
    
    	String id, newDescription, newQuantity, newWorkingData, record, record2;
        File db = new File("weapon.csv");
    	File tempDB = new File("weapon.csv");
    		
        BufferedWriter bw;
        Scanner read;
        try (BufferedReader br = new BufferedReader( new FileReader(db) )) {
            bw = new BufferedWriter( new FileWriter(tempDB) );
            read = new Scanner(System.in);
            System.out.println("\t\t status weapon\n\n");
            System.out.println("Enter id of weapon: ");
            id = read.nextLine();
            System.out.println(" ------------------------------------------------------------- ");
            System.out.println("|	ID	Descrition 	Quantity	WorkingDate 	  |");
            System.out.println(" ------------------------------------------------------------- ");
            while( ( record = br.readLine() ) != null ) {
                
                StringTokenizer st = new StringTokenizer(record,";");
                if( record.contains(id) ) {
                    System.out.println("|	"+st.nextToken()+"	"+st.nextToken()+" 		"+st.nextToken()+"			"+st.nextToken()+"      |");
                }
            }   System.out.println("|	                                            	          |");
            System.out.println(" ------------------------------------------------------------- ");
        }
	System.out.println("Enter the new Description the Tire: ");
    	newDescription = read.nextLine();    		
    	System.out.println("Enter the new Room the weapon: ");
    	newQuantity = read.nextLine();  
    	System.out.println("Enter the new status weapon: ");
    	newWorkingData = read.nextLine();  
    		
        try (BufferedReader br2 = new BufferedReader( new FileReader(db) )) {
            while( (record2 = br2.readLine() ) != null ) {
                if(record2.contains(id)) {
                    bw.write(id+";"+newDescription+";"+newQuantity+";"+newWorkingData);
                } else {
                    bw.write(record2);
                }
                bw.flush();
                bw.newLine();
            }
            bw.close();
        }    		
    	//db.delete();    		
    	boolean success = tempDB.renameTo(db);    		
    	System.out.println(success); 	
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return the ammunition
     */
    public int getAmmunition() {
        return ammunition;
    }

    /**
     * @param ammunition the ammunition to set
     */
    public void setAmmunition(int ammunition) {
        this.ammunition = ammunition;
    }
}
    
    
    