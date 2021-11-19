import java.util.Scanner;

public class HW06ControlStatements{
    static Scanner scanner = new Scanner(System.in); 
    static int select = -1; 
    static int n; 
        public static void main(String[] args) {
        
 
        while(select != 3){
            
            try{
            System.out.println("1.-multiplication table");
            System.out.println("2.-number even and odd?");
            System.out.println("3.-Exit");
            
                select = Integer.parseInt(scanner.nextLine()); 
    
          
                switch(select){
                case 1: 
                    InsertNumber();
                    System.out.print("Enter a whole number: ");                                                         
                     System.out.println("Table of " + n);
                     for(int i = 1; i<=12; i++){
                     System.out.println(n + " * " + i + " = " + n*i);                                                     
                 }
                   
                    break;
                case 2: 
                    InsertNumber();
                    
                    

        if ((n % 2) == 0){
            System.out.println(n + " it's even ");
        }else{
            System.out.println(n + " it's odd ");
        }
                   
                    break;
                case 3: 
                    System.out.println("Thanks!");
                    break;
                default:
                    System.out.println("Unrecognized number");break;
                }
                
                System.out.println("\n"); 
                
            }catch(Exception e){
                System.out.println("Uoop! Error!");
            }
        }

    }
    

    public static void InsertNumber(){
        System.out.println("Insert a number:");
        n = Integer.parseInt(scanner.nextLine());
        

        System.out.println("\n"); 
    }
}