import java.util.Scanner;
import java.util.*;
 
public class menu{
      
    public static void main(String[] args) {
         
       Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int option; 
        
       while(!salir){
            
           System.out.println("\nDEBER 1 - Michelle Alvarez\n\n");
           System.out.println("1. Option 1: Multiplication Table Option");
           System.out.println("2. Option 2: Odd or even number Option");
           System.out.println("3. Exit");
            
           System.out.println("\nIntroduce an option:");
           option = sn.nextInt();
            
           switch(option){

               case 1:
                   System.out.println("\nYou have selected Multiplication Table Option\n");


                    Scanner sc = new Scanner(System.in);
                      int n;

                   System.out.println("\nIntroduce a number to calculate the multiplication table: ");                                                         
                      n = sc.nextInt();

                   System.out.println("\nMultiplication table of the number" + n);

                      for(int i = 1; i<=12; i++){
                           System.out.println(n + " * " + i + " = " + n*i); 
                         }
                   break;

                case 2:
                    System.out.println("\nYou have selected Odd or even number Option\n");
                    Scanner teclado = new Scanner( System.in );
                      int number;
                    System.out.printf( "\nIntroduce an enter number to calculate if the number is odd or even: " );
                    number = teclado.nextInt();

                    if ( number % 2 == 0 ){
                    System.out.printf( "\nThe number is even\n" );
                    } else {
                    System.out.printf( "\nThe number is odd\n" );
                    }
                   break;

                case 3:
                   salir=true;
                   break;

                default:
                System.out.println("Choose an option");
                     
           }
        }
    }  
}