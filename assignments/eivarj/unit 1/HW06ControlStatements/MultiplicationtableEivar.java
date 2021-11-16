import java.util.Scanner;
 
public class MultiplicationtableEivar{
    public static void main(String[] ARGS)
    {
        Scanner leer=new Scanner(System.in);
		int opcion,numero,i,j;
		
		System.out.println("Elija la funcion a realizar: \n");
		System.out.println("1. Tabla de Multiplicar: \n");
		System.out.println("2. Saber si es par o impar: \n");
		System.out.println("3. Las 2 opiones: \n");
		opcion = leer.nextInt();
		
		switch(opcion){
			case 1:
				Scanner obtenerNumero = new Scanner(System.in);
				System.out.print("indica la tabla de multiplicar: ");
				numero = obtenerNumero.nextInt();
				for(j = 1; j <= 10; j++)
				{
					System.out.println(numero + " X " + j + " = " + numero*j);
				}
				System.out.println();
			break;
			case 2:
				Scanner teclado = new Scanner( System.in );
				System.out.printf( "Introduzca un numero entero: " );
				numero = teclado.nextInt();

				if ( numero % 2 == 0 ){
				System.out.printf( "ES PAR" );
				} else {
				System.out.printf( "ES IMPAR" );
				}
			break;
			case 3:
				Scanner teclad2 = new Scanner(System.in);
				System.out.printf( "Introduzca un numero entero: " );
				numero = teclad2.nextInt();
				for(j = 1; j <= 10; j++)
				{
					System.out.println(numero + " X " + j + " = " + numero*j);
				}
				System.out.println();
				if ( numero % 2 == 0 ){
				System.out.printf( "ES PAR" );
				} else {
				System.out.printf( "ES IMPAR" );
				}
			break;
		}
    }
}