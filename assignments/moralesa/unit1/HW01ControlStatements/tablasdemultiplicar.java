import java.util.Scanner;
 
public class multiplication_tables{
    public static void main(String[] ARGS)
    {
        Scanner leer=new Scanner(System.in);
                int opcion,numero,i,j;
                
                System.out.println("Choose the function you want to see: \n");
                System.out.println("1. Multiplication tables: \n");
                System.out.println("2. Even or odd numbers: \n");
                System.out.println("3. Both options: \n");
                opcion = leer.nextInt();
                
                switch(opcion){
                        case 1:
                                Scanner obtenerNumero = new Scanner(System.in);
                                System.out.print("Indicate which table you want to see: ");
                                numero = obtenerNumero.nextInt();
                                for(j = 1; j <= 10; j++)
                                {
                                        System.out.println(numero + " X " + j + " = " + numero*j);
                                }
                                System.out.println();
                        break;
                        case 2:
                                Scanner teclado = new Scanner( System.in );
                                System.out.printf( "Enter an integer: " );
                                numero = teclado.nextInt();

                                if ( numero % 2 == 0 ){
                                System.out.printf( "The number entered is even" );
                                } else {
                                System.out.printf( "The number entered is odd" );
                                }
                        break;
                        case 3:
                                Scanner teclad2 = new Scanner(System.in);
                                System.out.printf( "Enter an integer: " );
                                numero = teclad2.nextInt();
                                for(j = 1; j <= 10; j++)
                                {
                                        System.out.println(numero + " X " + j + " = " + numero*j);
                                }
                                System.out.println();
                                if ( numero % 2 == 0 ){
                                System.out.printf( "The number entered is even" );
                                } else {
                                System.out.printf( "The number entered is odd" );
                                }
                        break;
                }
    }
}