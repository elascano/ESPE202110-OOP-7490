import java.util.Scanner;


public class WS06_ControlStatements{
    static Scanner scanner = new Scanner(System.in); 
    static int select = -1; 
    static int n; 
        public static void main(String[] args) {
        
 
        while(select != 3){
            
            try{
            System.out.println("1. Multiplication table");
            System.out.println("2. Your number is even or uneven");
            System.out.println("3. Exit");
            
                select = Integer.parseInt(scanner.nextLine()); 
    
          
                switch(select){
                case 1: 
                    PickNumber();
                    System.out.print("Enter a whole number: ");                                                         
                     System.out.println("Table of " + n);
                     for(int i = 1; i<=12; i++){
                     System.out.println(n + " * " + i + " = " + n*i);                                                     
                 }
                   
                    break;
                case 2: 
                    PickNumber();
                    System.out.println("pick a number: ");
                    

        if ((n % 2) == 0){
            System.out.println(n + " Is even");
        }else{
            System.out.println(n + " Is uneven");
        }
                   
                    break;
                case 3: 
                    System.out.println("See you soon!");
                    break;
                default:
                    System.out.println("unrecognized number");break;
                }
                
                System.out.println("\n"); 
                
            }catch(Exception e){
                System.out.println("Uppps Error!");
            }
        }

    }
    

    public static void PickNumber(){
        System.out.println("Enter a number:");
        n = Integer.parseInt(scanner.nextLine());
        

        System.out.println("\n"); 
    }
}