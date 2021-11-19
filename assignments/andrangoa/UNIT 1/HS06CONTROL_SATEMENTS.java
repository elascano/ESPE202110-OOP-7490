import java.util.Scanner;


public class HS06CONTROL_SATEMENTS {
    static Scanner scanner = new Scanner(System.in); 
    static int select = -1; 
    static int n; 
        public static void main(String[] args) {
        
 
        while(select != 0){
            
            try{
            System.out.println("1----Table of .....");
            System.out.println("2----Yout number is even or odd?");
            System.out.println("0----Exit");
            
                select = Integer.parseInt(scanner.nextLine()); 
    
          
                switch(select){
                case 1: 
                    ChooseNumber();
                                                                           
                     System.out.println("Table of " + n);
                     for(int i = 1; i<=12; i++){
                     System.out.println(n + " * " + i + " = " + n*i);                                                     
                 }
                   
                    break;
                case 2: 
                    ChooseNumber();
                 
                    

        if ((n % 2) == 0){
            System.out.println(n + " Is even");
        }else{
            System.out.println(n + " Is odd");
        }
                   
                    break;
                case 0: 
                    break;
                default:
                    System.out.println("try again");break;
                }
                
                System.out.println("\n"); 
                
            }catch(Exception e){
            
            }
        }

    }
    

    public static void ChooseNumber(){
        System.out.println("Choose Number :");
        n = Integer.parseInt(scanner.nextLine());
        

        System.out.println("\n"); 
    }
}
