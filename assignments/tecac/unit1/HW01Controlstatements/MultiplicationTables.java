import java.util.Scanner;
public class MultiplicationTables {
    public static void main(String [] args){	
        			System.out.println("\n\t\tMultiplication tables by Camila Teca\n");
	Scanner teclado = new Scanner( System.in );
    int num;
        System.out.println("Want to see a table and odd / even number? (Write number Yes(1) - No(0))");
        num = teclado.nextInt();
        
    while (num == 1)
        {
        System.out.println("\nWhat multiplication table do you want to see?");
        int numero;
        numero = teclado.nextInt();
        
    for(int i=1; i<=12; i++){
        	System.out.println(numero + " X " + i + " = " + (numero*i));
        }
    

    int n;
        System.out.println("\nEnter number:");
        n = teclado.nextInt();

    if(n % 2 == 0)
        {
        	System.out.println("The number -> " + n + " is even\n");
        } 
    else 
        {
        	System.out.println("The number -> " + n + " is odd\n");
        }
		

	System.out.println("\nWant to see a table and odd / even number again? (Write number Yes(1) - No(0))");
        num = teclado.nextInt();
        }

    if(num==0)
        {
        	System.out.println("\n\t\tThe program will end\t\t\n");
        }
        }
    }