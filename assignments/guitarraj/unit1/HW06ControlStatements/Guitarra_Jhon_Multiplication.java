import java.util.InputMismatchException;
import java.util.Scanner;
public class UseScan {
	
	public static void main(String [] args){
		System.out.println("\n\nHOMEWORK 06");
		System.out.println("\nGUITARRA SANCHES JHON ALEXANDER");
		Scanner sn = new Scanner(System.in);
		boolean salir = false;
        int opcion;
 
        while (!salir) {
 
            System.out.println("\nOPTION 1: MULTIPLICATION TABLE ");
            System.out.println("OPTION 2: EVEN OR ODD");
            System.out.println("OPTION 3: EXIT ");
 
            try {
 
                System.out.println("\nSELECT AT OPTION ");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("\nou have selected option 1 MULTIPLICATION TABLE");
                		System.out.println("\nENTER A NUMBER WHICH YOU WANT TO KNOW THE MULTIPLY TABLE\n\n");
                		Scanner leer = new Scanner(System.in);
                		int n1 =leer.nextInt();
                		System.out.println("\n multiplication tables ->");
                		for (int i=1; i<=12;i++){
                			System.out.println( n1 + "x"+ i + "=" + (i*n1));
                		}
                        break;
                    case 2:
                        System.out.println("\nYou have selected option 2");

                		int numero;
                        Scanner teclado = new Scanner( System.in );

                        System.out.printf( "\nEnter a whole number: " );
                        numero = teclado.nextInt();

                        if ( numero % 2 == 0 ){
                            System.out.printf( "\nIS PAIR\n\n" );

                        }
                        else{
                            System.out.printf( "\nIS ODD\n\n" );
                        }
                        break;
                    
                    case 3:
                        salir = true;
                        break;
                    default:
                    System.out.println("\nENTER A CORRECT NUMBER ONLY BETWEEN 1 AND 3");
                }
            }catch (InputMismatchException e) {
                System.out.println("\nINSTERT A NUMBER");
                sn.next();
            }
   		}
	}
}
