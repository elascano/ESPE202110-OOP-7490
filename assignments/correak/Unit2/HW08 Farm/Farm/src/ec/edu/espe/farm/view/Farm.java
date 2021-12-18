package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Cow;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Pig;
import ec.edu.espe.farm.model.Sheep;
/*import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;*/
import java.io.File;
import java.io.FileWriter;
import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Kerly
 */
public class Farm {
public static final char SEPARADOR = ';';
public static final char COMILLAS = '"';
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Chicken chicken;
       
        FarmAnimal farmAnimal;
        int option;
        int id ;
        String breed ;
        String fecha ;
        boolean isMolting=true;
        boolean isProducingMilk;
        float weight ;
        
        ArrayList<Chicken> chickens = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date bornOn;
        
        do{
        
            System.out.println("------MENU-------");
            System.out.println("1.Enter chickens  \n2. Enter one Pig  \n3. Enter one Sheep  \n4.Enter one cow \n5.Exit" );
            System.out.println("-----------------");
            System.out.println("Ingrese su opcion:");
            option=sc.nextInt();
            
            switch(option){
                case 1:
                   
                   System.out.println("Enter the born whit format dd/mm/yyyy");
                   fecha = sc.next();
                   bornOn = df.parse(fecha);
                   System.out.println("born "+df.format(bornOn));
                   System.out.println("Enter id:");
                   id=sc.nextInt();
                   System.out.println("Enter breed");
                   breed=sc.next();
                   System.out.println("is Molting:");
                   isMolting=sc.hasNextLine();
                   chicken= new Chicken( isMolting, id, breed, bornOn);
                   farmAnimal=new FarmAnimal(id, breed, bornOn, chickens);
                   chickens.add(chicken);
                   System.out.println(farmAnimal);
                   
                   String id4 = String.valueOf(id);
                   String bornOn4 = String.valueOf(bornOn);
                   
                   try {
                        File archivo = new File("Chickens.txt");
                        
                        FileWriter escribir=new FileWriter(archivo,true);
                        
                        escribir.write("\nid:"+id4+"| born:"+bornOn4+"|breed:"+breed+"|is molting:"+isMolting+"\n");
                    
                        escribir.close();
                    } catch (Exception e) {
                        System.out.println("Error al escribir");
                    } 
            
                        
                    
                    break;
                
                case 2:

                    System.out.println("Enter the born whit format dd/mm/yyyy");
                    fecha = sc.next();                                       
                    bornOn = df.parse(fecha);
                    System.out.println("born "+df.format(bornOn));
                    
                    System.out.println("Enter id:");
                    id=sc.nextInt();
                    
                    System.out.println("Enter breed");
                    breed=sc.next();
                    
                    System.out.println("Enter weight:");
                    weight=sc.nextFloat();
                    
                    Pig pig= new Pig(weight, id, breed, bornOn);
                    farmAnimal=new Pig(weight, id, breed, bornOn);
                    
                    System.out.println("id     ->"+pig.getId());
                    System.out.println("breed  ->"+pig.getBreed());
                    System.out.println("weight ->"+pig.getWeight());
                    System.out.println("born   ->"+pig.getBornOn());
                    
                    System.out.println(pig);
                    
                    String id3 = String.valueOf(id);
                    String weight3 = String.valueOf(weight);
                    String bornOn3 = String.valueOf(bornOn);
                    
                    try {
                        File archivo = new File("Sheep.txt");
                        
                        FileWriter escribir=new FileWriter(archivo,true);
                        
                        escribir.write("\nid:"+id3+"| born:"+bornOn3+"| weight:"+weight3+"|breed:"+breed+"\n");
                    
                        escribir.close();
                    } catch (Exception e) {
                        System.out.println("Error al escribir");
                    }
                    
                    break; 
                    
                case 3:
                    System.out.println("Enter the born whit format dd/mm/yyyy");
                    fecha = sc.next();                                       
                    bornOn = df.parse(fecha);
                    System.out.println("born "+df.format(bornOn));
                    
                     System.out.println("Enter the last sheering whit format dd/mm/yyyy");
                    fecha = sc.next(); 
                    Date lastSheering;
                    lastSheering = df.parse(fecha);
                    System.out.println("born "+df.format(lastSheering));
                    
                    System.out.println("Enter id:");
                    id=sc.nextInt();
                    
                    System.out.println("Enter breed");
                    breed=sc.next();
                    
                    System.out.println("Enter weight:");
                    weight=sc.nextFloat();
                    
                    farmAnimal=new Sheep(lastSheering, id, breed, bornOn);
                    Sheep sheep= new Sheep(lastSheering, id, breed, bornOn);
                    System.out.println("id     ->"+sheep.getId());
                    System.out.println("breed  ->"+sheep.getBreed());
                    System.out.println("weight ->"+sheep.getLastSheering());
                    System.out.println("born   ->"+sheep.getBornOn());
                    
                    String id2 = String.valueOf(id);
                    String weight2 = String.valueOf(weight);
                    String bornOn2 = String.valueOf(bornOn);
                    
                    try {
                        File archivo = new File("Sheep.txt");
                        
                        FileWriter escribir=new FileWriter(archivo,true);
                        
                        escribir.write("\nid:"+id2+"| born:"+bornOn2+"| weight:"+weight2+"|breed:"+breed+"|Last sheering:"+lastSheering);
                    
                        escribir.close();
                    } catch (Exception e) {
                        System.out.println("Error al escribir");
                    }
                    
                    break;
                    
                case 4:
                    System.out.println("Enter the born whit format dd/mm/yyyy");
                    fecha = sc.next();                                       
                    bornOn = df.parse(fecha);
                    System.out.println("born "+df.format(bornOn));
                    
                    System.out.println("Enter id:");
                    id=sc.nextInt();
                    
                    System.out.println("Enter breed");
                    breed=sc.next();
                    
                    System.out.println("Enter weight:");
                    weight=sc.nextFloat();
                    
                    System.out.println("Enter if producing milk:");
                    isProducingMilk=sc.hasNextLine();
                    
                    farmAnimal=new Cow(isProducingMilk, id, breed, bornOn);
                    Cow cow= new Cow(isProducingMilk, id, breed, bornOn);
                    
                    System.out.println("id: "+cow.getId()+",breed: "+cow.getBreed()+",Poducing milk: "+cow.isIsProducingMilk());
                    
                    System.out.print(",Poducing milk: "+cow.isIsProducingMilk()+",born:"+cow.getBornOn());
                    
                    System.out.println(farmAnimal);
                    
                    String id1= String.valueOf(id);
                    String bornOn1= String.valueOf(bornOn);
                    String weight1= String.valueOf(weight);
                    
                    try {
                        File archivo = new File("cows.txt");
                        
                        FileWriter escribir=new FileWriter(archivo,true);
                        
                        escribir.write("\nid:"+id1+"| born:"+bornOn1+"| weight:"+weight1+"|breed:"+breed+"|producing milk:"+isProducingMilk);
                    
                        escribir.close();
                    } catch (Exception e) {
                        System.out.println("Error al escribir");
                    }
                    
                    break;
                    
                case 5:
            }
         
        }while(option !=5);
 
        
    }
   
}
    

