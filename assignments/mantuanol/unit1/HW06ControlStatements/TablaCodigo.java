import java.util.Scanner;
 
public class TablaCodigo{
    public static void main(String[] ARGS)
    {
        Scanner leer=new Scanner(System.in);
        int opcion,numero,i,j;
        
        System.out.println("Select the desired function: \n");
        System.out.println("1. Multiplication table: \n");
        System.out.println("2. Even or odd: \n");
        System.out.println("3. Both options: \n");
        opcion = leer.nextInt();
        
        switch(opcion){
            case 1:
                Scanner getNumber = new Scanner(System.in);
                System.out.print("multiplication table: ");
                numero = getNumber.nextInt();
                for(j = 1; j <= 10; j++)
                {
                    System.out.println(numero + " X " + j + " = " + numero*j);
                }
                System.out.println();
            break;
            case 2:
                Scanner keypad = new Scanner( System.in );
                System.out.printf( "Enter an integer number: " );
                numero = keypad.nextInt();

                if ( numero % 2 == 0 ){
                System.out.printf( "It is an even number" );
                } else {
                System.out.printf( "It is an odd number" );
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
                if (numero % 2 == 0 ){
                System.out.printf( "It is an even number" );
                } else {
                System.out.printf( "It is an odd number" );
                }
            break;
        }
    }
}


