//Mateo Landazuri
import java.util.Scanner;
 
public class menutablamateo{
    public static void main(String[] ARGS)
    {
        Scanner leer=new Scanner(System.in);
		int opcion,numero,i,j;
		
		System.out.println("Choose the function to perform: \n");
		System.out.println("1. Multiplication table: \n");
		System.out.println("2. Know if it is odd or even: \n");
		System.out.println("3. The 2 options: \n");
		opcion = leer.nextInt();
		
		switch(opcion){
			case 1:
				Scanner obtenerNumero = new Scanner(System.in);
				System.out.print("Indicates the multiplication table: ");
				numero = obtenerNumero.nextInt();
				for(j = 1; j <= 10; j++)
				{
					System.out.println(numero + " X " + j + " = " + numero*j);
				}
				System.out.println();
			break;
			case 2:
				Scanner teclado = new Scanner( System.in );
				System.out.printf( "Enter a whole number: " );
				numero = teclado.nextInt();

				if ( numero % 2 == 0 ){
				System.out.printf( "IS PAIR" );
				} else {
				System.out.printf( "IS ODD" );
				}
			break;
			case 3:
				Scanner teclad2 = new Scanner(System.in);
				System.out.printf( "Enter a whole number: " );
				numero = teclad2.nextInt();
				for(j = 1; j <= 10; j++)
				{
					System.out.println(numero + " X " + j + " = " + numero*j);
				}
				System.out.println();
				if ( numero % 2 == 0 ){
				System.out.printf( "IS PAIR" );
				} else {
				System.out.printf( "IS ODD" );
				}
			break;
		}
    }
}
