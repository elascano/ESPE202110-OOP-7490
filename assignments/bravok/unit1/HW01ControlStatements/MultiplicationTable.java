import java.util.InputMismatchException;
import java.util.Scanner;
 
public class MultiplicationTable{
 
    public static void main(String[] args) {
 
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //We will save the user's option 
 
        while (!salir) {
 
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Option 3");
            System.out.println("4. Exit");
 
            try {
 
                System.out.println("Write one of the options");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("You have selected option 1");
                        
//BRAVO KATHERIN HOMEWORK

 
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a whole number: ");                                                         
        n = sc.nextInt();
        System.out.println("Table of" + n);
        for(int i = 1; i<=10; i++){
             System.out.println(n + " * " + i + " = " + n*i);                                                     
        }
                        break;
                    case 2:
                        System.out.println("You have selected option 2");
System.out.println("Enter a number you want to evaluate");
int numero;
Scanner op = new Scanner(System.in);
numero = op.nextInt();

                        if (numero % 2 == 0) {
         System.out.println ("pair");
    } else {
         System.out.println ("odd");
    }
                        break;
                    
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Only numbers between 1 and 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("You must insert a number");
                sn.next();
            }
        }
 
    }
 
}