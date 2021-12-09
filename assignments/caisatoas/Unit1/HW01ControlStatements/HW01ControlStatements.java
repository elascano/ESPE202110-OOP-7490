// Autor: Sebastian Caisatoa Ramirez

import java.util.Scanner;
 
public class Deber1Caisatoa{
    public static void main(String[] ARGS)
    {
		String tecla = null;

        Scanner leer=new Scanner(System.in);
		int opciones,num,i,j;
		
		do{
		System.out.println("\n*******************HomerWord 1*******************\n");
		System.out.println("******Sebastian Bernardo Caisatoa Ramirez******");
		System.out.println("\n\tOption menu: \n");
		System.out.println("\t1. Multiplication table: \n");
		System.out.println("\t2. Number is Odd or Even: \n");
		System.out.println("\t3. Perform the 2 options: \n");
		opciones = leer.nextInt();
		boolean opc = (opciones <= 3);
		if (opc) {
			switch(opciones){
				case 1:
					Scanner obtenerNumero = new Scanner(System.in);
					System.out.print("\n\tEnter a Whole Number: ");
					num = obtenerNumero.nextInt();
					for(j = 1; j <= 10; j++)
					{
						System.out.println("\t\t"+num + " X " + j + " = " + num*j);
					}
					System.out.println();
				break;
				case 2:
					Scanner teclado = new Scanner( System.in );
					System.out.printf( "\n\tEnter a Whole Number: " );
					num = teclado.nextInt();

					if ( num % 2 == 0 ){
					System.out.printf("\t\t"+num+" is an EVEN number\n");
					} else {
					System.out.printf("\t\t"+num+" is an ODD number\n" );
					}
				break;
				case 3:
					Scanner teclad2 = new Scanner(System.in);
					System.out.printf("\n\tEnter a Whole Number: ");
					num = teclad2.nextInt();
					for(j = 1; j <= 12; j++)
					{
						System.out.println("\t\t"+num + " X " + j + " = " + num*j);
					}
					System.out.println();
					if ( num % 2 == 0 ){
					System.out.printf("\t\t"+num+" is an EVEN number\n");
					} else {
					System.out.printf("\t\t"+num+" is an ODD number\n");
					}
			break; }
				} else {
				System.out.println("Enter a number from 1 to 3."); 
				}
				System.out.println("\n\tDo you want to do any other operation?\n");
				System.out.println("\t\t1. If you enter the 's'");
				System.out.println("\t\t2. Do not enter the 'n'");
			tecla = new Scanner(System.in).nextLine();
 
		} while (tecla.equals("s") || tecla.equals("S"));
	} 
}