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
 * @author ALEJANDRO DE LACRUZ
 */
public class Products {
        
    public void AddProduct() throws IOException {
    		
    	BufferedWriter bw = new BufferedWriter( new FileWriter("device.csv",true) );
    	Scanner read = new Scanner(System.in);
    	String ID, description, quantity, workingData;
                
    	System.out.print("Enter ID the Product : ");
    	ID = read.nextLine();
    	System.out.print("Enter Description the Product ");
    	description = read.nextLine();
    	System.out.print("Enter Quantity the product ");
    	quantity = read.nextLine();
    	System.out.print("enter the expiration date of the product ");  		
    	workingData = read.nextLine();
                
    	bw.write(ID+";"+description+";"+quantity+";"+workingData);
    	bw.flush();
    	bw.newLine();
    	bw.close();
    }

public void ViewProduct() throws IOException {
    	BufferedReader br = new BufferedReader( new FileReader("device.csv") );
    		
    	String record;
    	System.out.println(" ------------------------------------------------------------- ");
    	System.out.println("|	ID	Descrition 	  Quantity	    Date Expiration     |");
    	System.out.println(" ------------------------------------------------------------- ");
    		
    	while( ( record = br.readLine() ) != null ) {
    			
            StringTokenizer st = new StringTokenizer(record,";");
            System.out.println("|	"+st.nextToken()+"	"+st.nextToken()+" 		"+st.nextToken()+"		"+st.nextToken()+"        |");
	
    	}	
    	System.out.println("|	                                            	          |");
    	System.out.println(" ------------------------------------------------------------- ");
    	br.close();	
    } 
    public void DeleteProduct() throws IOException {
    	Scanner read =  new Scanner(System.in);
    	String ID, record;
    		
    	File tempDB = new File("device.csv");
    	File db = new File("device.csv");
    		
    	BufferedReader br = new BufferedReader( new FileReader( db ) );
    	BufferedWriter bw = new BufferedWriter( new FileWriter( tempDB ) );
    		
    	System.out.println("\t\t Delete Product on CSV\n");
    	System.out.println("Enter ID the Product: ");
    	ID =  read.nextLine();
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

    public void SearchProductID() throws IOException {
    	String ID,record;
    	Scanner read = new Scanner(System.in);
    		
    	BufferedReader br = new BufferedReader( new FileReader("device.csv") );
    		
    	System.out.println("\t\t Search Product on CSV\n");
    	
    	System.out.println("Enter ID the Product: ");
    	ID = read.nextLine();
    		
    	System.out.println(" ------------------------------------------------------------- ");
    	System.out.println("|	ID	Descrition 	quantity	Date Expiration 	  |");
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

    public void updateProductID() throws IOException {
    
    	String ID, newDescription, newQuantity, newWorkingData, record, record2;
        File db = new File("device.csv");
    	File tempDB = new File("device.csv");
    		
    	BufferedReader br = new BufferedReader( new FileReader(db) );
    	BufferedWriter bw = new BufferedWriter( new FileWriter(tempDB) );
    		    		
    	Scanner read = new Scanner(System.in);
    		
    	System.out.println("\t\t Update Dates the Products\n\n");   
	System.out.println("Enter ID the Product: ");
	ID = read.nextLine();	    		
	System.out.println(" ------------------------------------------------------------- ");
	System.out.println("|	ID	Descrition 	Quantity	Date Expiration 	  |");
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
	System.out.println("Enter the new Description the Product ");
    	newDescription = read.nextLine();    		
    	System.out.println("Enter the new Room the Product ");
    	newQuantity = read.nextLine();  
    	System.out.println("Enter  the expiration date of the product ");
    	newWorkingData = read.nextLine();  
    		
    	BufferedReader br2 = new BufferedReader( new FileReader(db) );
    	while( (record2 = br2.readLine() ) != null ) {    			
            if(record2.contains(ID)) {
    		bw.write(ID+";"+newDescription+";"+newQuantity+";"+newWorkingData);
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
