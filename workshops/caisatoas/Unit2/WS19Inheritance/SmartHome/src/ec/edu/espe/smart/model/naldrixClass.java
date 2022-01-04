
package ec.edu.espe.smart.model;

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
 * @author Caisatoa
 */
public class naldrixClass {
        
    public void AddRecord() throws IOException {
    		
    	BufferedWriter bw = new BufferedWriter( new FileWriter("device.csv",true) );
    	Scanner strInput = new Scanner(System.in);
    	Scanner read = new Scanner(System.in);
    	String ID, description, room, workingData;
                
    	System.out.print("Enter ID the Product: ");
    	ID = strInput.nextLine();
    	System.out.print("Enter Description the Product: ");
    	description = strInput.nextLine();
    	System.out.print("Enter Room the Product: ");
    	room = strInput.nextLine();
    	System.out.print("Enter Working Date the Product: ");  		
    	workingData = read.nextLine();
                
    	bw.write(ID+";"+description+";"+room+";"+workingData);
    	bw.flush();
    	bw.newLine();
    	bw.close();
    }

public void ViewAllRecord() throws IOException {
    	BufferedReader br = new BufferedReader( new FileReader("device.csv") );
    		
    	String record;
    	System.out.println(" ------------------------------------------------------------- ");
    	System.out.println("|	ID	Descrition 	  Room	        WorkingDate 	  |");
    	System.out.println(" ------------------------------------------------------------- ");
    		
    	while( ( record = br.readLine() ) != null ) {
    			
            StringTokenizer st = new StringTokenizer(record,";");
            System.out.println("|	"+st.nextToken()+"	"+st.nextToken()+" 		"+st.nextToken()+"		"+st.nextToken()+"        |");
	
    	}	
    	System.out.println("|	                                            	          |");
    	System.out.println(" ------------------------------------------------------------- ");
    	br.close();	
    } 
    public void DeleteRecordByID() throws IOException {
    	Scanner strInput =  new Scanner(System.in);
    	String ID, record;
    		
    	File tempDB = new File("device.csv");
    	File db = new File("device.csv");
    		
    	BufferedReader br = new BufferedReader( new FileReader( db ) );
    	BufferedWriter bw = new BufferedWriter( new FileWriter( tempDB ) );
    		
    	System.out.println("\t\t Delete Product on CSV\n");
    	System.out.println("Enter ID the Product: ");
    	ID =  strInput.nextLine();
    	while( ( record = br.readLine() ) != null ) {
            if( record.contains(ID) ) 
    		continue;
                bw.write(record);
    		bw.flush();
    		bw.newLine();
            }
            br.close();
            bw.close();
            //db.delete();
            tempDB.renameTo(db);
    }

    public void SearchRecordbyID() throws IOException {
    	String ID,record;
    	Scanner strInput = new Scanner(System.in);
    		
    	BufferedReader br = new BufferedReader( new FileReader("device.csv") );
    		
    	System.out.println("\t\t Search Product on CSV\n");
    	
    	System.out.println("Enter ID the Product: ");
    	ID = strInput.nextLine();
    		
    	System.out.println(" ------------------------------------------------------------- ");
    	System.out.println("|	ID	Descrition 		Room		WorkingDate 	  |");
    	System.out.println(" ------------------------------------------------------------- ");
    	while( ( record = br.readLine() ) != null ) {
            StringTokenizer st = new StringTokenizer(record,";");
            if( record.contains(ID) ) {
    		System.out.println("|	"+st.nextToken()+"	"+st.nextToken()+" 		"+st.nextToken()+"			"+st.nextToken()+"      |");
            }	
    	}
    	System.out.println("|	                                            	          |");
    	System.out.println(" ------------------------------------------------------------- ");    		
    	br.close();
    }

    public void updateRecordbyID() throws IOException {
    
    	String ID, newDescription, newRoom, newWorkingData, record, record2;
        File db = new File("device.csv");
    	File tempDB = new File("device.csv");
    		
    	BufferedReader br = new BufferedReader( new FileReader(db) );
    	BufferedWriter bw = new BufferedWriter( new FileWriter(tempDB) );
    		    		
    	Scanner strInput = new Scanner(System.in);
    		
    	System.out.println("\t\t Update Dates the Products\n\n");   
	System.out.println("Enter ID the Product: ");
	ID = strInput.nextLine();	    		
	System.out.println(" ------------------------------------------------------------- ");
	System.out.println("|	ID	Descrition 		Room		WorkingDate 	  |");
	System.out.println(" ------------------------------------------------------------- ");
	    		
	while( ( record = br.readLine() ) != null ) {
	    			
	    StringTokenizer st = new StringTokenizer(record,";");
	    if( record.contains(ID) ) {
	    	System.out.println("|	"+st.nextToken()+"	"+st.nextToken()+" 		"+st.nextToken()+"			"+st.nextToken()+"      |");
	    }	
	}	    		
	System.out.println("|	                                            	          |");
	System.out.println(" ------------------------------------------------------------- ");
	br.close();
	System.out.println("Enter the new Description the Product: ");
    	newDescription = strInput.nextLine();    		
    	System.out.println("Enter the new Room the Product: ");
    	newRoom = strInput.nextLine();  
    	System.out.println("Enter the new Working Date the Product: ");
    	newWorkingData = strInput.nextLine();  
    		
    	BufferedReader br2 = new BufferedReader( new FileReader(db) );
    	while( (record2 = br2.readLine() ) != null ) {    			
            if(record2.contains(ID)) {
    		bw.write(ID+";"+newDescription+";"+newRoom+";"+newWorkingData);
            } else {
    		bw.write(record2);	
            }    			
            bw.flush();
            bw.newLine();
    	}
    	bw.close();
    	br2.close();    		
    	//db.delete();    		
    	boolean success = tempDB.renameTo(db);    		
    	System.out.println(success); 	
    }
}
