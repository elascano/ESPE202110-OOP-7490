// by: Alejandro Delacruz

import java.util.Scanner;
 
public class tablasalejo{
    public static void main(String[] ARGS)
    {
        Scanner leer=new Scanner(System.in);
		int opcion,numero,i,j;
		
		System.out.println("Choose the option : \n");
		System.out.println("1. multiplication of table: \n");
		System.out.println("2. par o impar: \n");
		System.out.println("3. two option: \n");
		opcion = leer.nextInt();
		
		switch(opcion){
			case 1:
				Scanner obtenerNumero = new Scanner(System.in);
				System.out.print("point to the multiplication table: ");
				numero = obtenerNumero.nextInt();
				for(j = 1; j <= 10; j++)
				{
					System.out.println(numero + " X " + j + " = " + numero*j);
				}
				System.out.println();
			break;
			case 2:
				Scanner teclado = new Scanner( System.in );
				System.out.printf( "write a whole number: " );
				numero = teclado.nextInt();

				if ( numero % 2 == 0 ){
				System.out.printf( "PAR" );
				} else {
				System.out.printf( "IMPAR" );
				}
			break;
			case 3:
				Scanner teclad2 = new Scanner(System.in);
				System.out.printf( "write a whole number: " );
				numero = teclad2.nextInt();
				for(j = 1; j <= 10; j++)
				{
					System.out.println(numero + " X " + j + " = " + numero*j);
				}
				System.out.println();
				if ( numero % 2 == 0 ){
				System.out.printf( "PAR" );
				} else {
				System.out.printf( "IMPAR" );
				}
			break;
		}
    }
}