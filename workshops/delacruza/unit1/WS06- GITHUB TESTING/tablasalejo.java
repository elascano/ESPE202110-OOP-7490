// by: Alejandro Delacruz

import java.util.Scanner;
 
public class tablasalejo{
   static Scanner scanner =new Scanner(System.in);

    public static void main(String[] args) {
   
           int opcion = 0;
            do {

            System.out.println("\n Welcome ");
            System.out.println("\n Type --1-- know some multiplication table from 1 to 10");
            System.out.println("\n Type --2-- to find out if it is odd or even");
            System.out.println("\n Type --3-- Is it odd or even?");
                System.out.println("\n enter option");
               opcion= scanner.nextInt();
                
            

                 switch (opcion){
                case 1:
                    mostrar();
                    break;
                case 2:
                    par();
                    break;
                 }
                
            } while(opcion!=3);
            System.out.println("\n We're Done... Thanks, have a good day");
             
            
    }
        static void mostrar() {
        
        System.out.println("\n enter the number of the table you want to know ");
        int numero1 = scanner.nextInt();
            System.out.println("\n The table of the number entered is ----->");
            int i;
            for(i=1;i<=11;i++)
            {
                int multi= numero1*i;
                System.out.println("\n "+numero1+" * "+i+" ="+multi);
            }
            }
        static void par() {
            int n;
            System.out.println("\n enter the number to evaluate");
            n = scanner.nextInt();
            if(n % 2 ==0) {
                System.out.println("\n The number is even");
                
            }
            if (n%3 ==0) {
                System.out.println("\n The number is Odd");
            }
            
        }
    }
