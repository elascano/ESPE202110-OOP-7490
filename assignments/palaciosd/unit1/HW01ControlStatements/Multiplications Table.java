import java.util.Scanner;
 
public class Deber{
    public static void main(String[] ARGS)
    {
        Scanner leer=new Scanner(System.in);
		int opcion,numero,i,j;

		System.out.println("\n  \s -----HOMEWORK 1 SEBASTIAN PALACIOS----- \n");
		System.out.println("Choose the function to perform: \n");
		System.out.println("1. MULTIPLICATION TABLE: \n");
		System.out.println("2. ODD OR EVEN NUMBER: \n");
		opcion = leer.nextInt();
		
		switch(opcion){
			case 1:
				Scanner obtenerNumero = new Scanner(System.in);
				System.out.print("ENTER A NUMBER: ");
				numero = obtenerNumero.nextInt();
				for(j = 1; j <= 10; j++)
				{
					System.out.println(numero + " X " + j + " = " + numero*j);
				}
				System.out.println();
			break;
			case 2:
				Scanner teclad2 = new Scanner(System.in);
				System.out.printf( "ENTER A NUMBER: " );
				numero = teclad2.nextInt();
				System.out.println();
				if ( numero % 2 == 0 ){
				System.out.printf( "IS EVEN \n");
				} else {
				System.out.printf( "IS ODD \n");


				}

		}
    }
}