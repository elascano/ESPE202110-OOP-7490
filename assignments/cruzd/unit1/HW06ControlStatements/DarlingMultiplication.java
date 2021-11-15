import java.util.InputMismatchException;
import java.util.Scanner;
public class UseScan {
	
	public static void main(String [] args){
		System.out.println("DARLING MICAELA CRUZ PANTOJA");
		Scanner read = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		        boolean exit = false;
        int option; // We will save the user's option
 
        while (!exit) {
 
            System.out.println("1. OPTION 1: TABLE ");
            System.out.println("2. OPTION 2: PAIR OR ODD");
            System.out.println("3. Exit");
 
            try {
 
                System.out.println("CONTEXTUAL MENU ");
                option = sn.nextInt();
 
                switch (option) {
                    case 1:
                        System.out.println("You have selected option 1");

		System.out.println("\n ENTER A NUMBER WHICH YOU WANT TO KNOW THE MULTIPLY TABLE \n\n");
		int num1 =read.nextInt();
		System.out.println("\n multiplication tables ->");
		for (int i=1; i<=12;i++){
			System.out.println( num1 + "x"+ i + "=" + (i*num1));
		}
                        break;
                    case 2:
                        System.out.println("You have selected option 2");

		int number;
        Scanner keyboard= new Scanner( System.in );

        System.out.printf( " Enter a whole number: " );
        number = keyboard.nextInt();

        if ( number % 2 == 0 )
        {
            System.out.printf( "IS PAIR\n\n" );
        }
        else
        {
            System.out.printf( "IS ODD\n\n" );
        }

                        break;
                    case 3:
                        exit = true;
                        break;
                    default:
                        System.out.println("Only numbers 1 and 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("You must insert a number ");
                sn.next();
            }
   		}
	}
}
