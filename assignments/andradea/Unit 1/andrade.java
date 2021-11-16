import java.util.InputMismatchException;
import java.util.Scanner;
public class UseScan {
	
	public static void main(String [] args){
		Scanner sn = new Scanner(System.in);
		boolean salir = false;
        int opcion;
 
        while (!salir) {
 
            System.out.println("\n Select de option 1 if you want to see a multiplication table, option 2 to see if it is odd or even, option 3 to exit\n ");
            System.out.println("1 MULTIPLICATION TABLE:");
            System.out.println("2 EVEN OR ODD:");
            System.out.println("0 EXIT:");
 
            try {
 
                System.out.println("\n one option \n");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("\n option 1 MULTIPLICATION TABLE \n");
                		System.out.println("\n select a number \n ");
                		Scanner leer = new Scanner(System.in);
                		int n1 =leer.nextInt();
                		System.out.println("multiplication tables ->");
                		for (int i=1; i<=12;i++){
                			System.out.println( n1 + "x"+ i + "=" + (i*n1));
                		}
                        break;
                    case 2:
                        System.out.println("\n opcion 2: even or odd \n ");

                		int numero;
                        Scanner teclado = new Scanner( System.in );

                        System.out.printf( "\n select a number\n " );
                        numero = teclado.nextInt();

                        if ( numero % 2 == 0 ){
                            System.out.printf( "even" );

                        }
                        else{
                            System.out.printf( "odd" );
                        }
                        break;
                    
                    case 0:
                        System.out.println("\n thanks \n ");
                        salir = true;
                        break;
                    default:
                    System.out.println("\n select a number in the range of 0 to 2 \n");
                }
            }catch (InputMismatchException e) {
                System.out.println("\n select just a number \n ");
                sn.next();
            }
   		}
	}
}