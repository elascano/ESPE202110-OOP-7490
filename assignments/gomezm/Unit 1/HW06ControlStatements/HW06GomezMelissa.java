import java.util.InputMismatchException;
import java.util.Scanner;
 
public class MultiplicationTableHomework{
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int option;
 
        while (!exit) {
 
            System.out.println("\n1. The number is even or odd");
            System.out.println("2. The multiplication table of the number");
            System.out.println("3. Exit");
 
            try {
 
                System.out.println("\nChoose an option");
                option = sn.nextInt();
 
                switch (option) {
                    case 1:
                        System.out.println("\nYou've choose the first option, now select a number.\n");
                        {
                            int numero=0;
                        {
                          numero= sc.nextInt();
                            if(numero%2==0)
                            {
                                System.out.println("it's even");
                            }
                            else{
                                System.out.println("it's odd");
                            }  
                        }  
                        }
                           
                        break;
                    case 2:
                        System.out.println("\nYou've choose the second option, now select a number.");
                        {
                            int numero=0;
                        {
                            numero= sc.nextInt();
                            if(numero!=0){
                                System.out.println("\nMultiplication Table of " + numero);
                                for(int i=1; i<=12; i++){
                                    System.out.println(numero + "x" + i + "=" + (numero*i));
                                }
                            }
                        }        

                        }
                          
                        break;
                    case 3:
                    exit = true;
                        break;
                    default:
                        System.out.println("Just numbers betwen 1 to 3");
            } 
            }catch (InputMismatchException e) {
                System.out.println("You must choose a number");
                sn.next();
        }
 
    }
 
}
}
