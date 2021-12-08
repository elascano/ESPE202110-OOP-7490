import java.util.Scanner;
 
public class tablaMultiplicar{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int opcion=0;
        do{
        System.out.println("---Welcome dear user to HW06ControlStatements by Pablo Bustillos---\n");
        System.out.println("multiplication tables(1)\n");
        System.out.println("Odd and even numbers(2)\n");
        

        System.out.println("please enter the option");
            opcion=scanner.nextInt();
            switch(opcion){
            case 1:
            multiplication_tables();
            break;
            case 2:
            Odd_and_even_numbers();
            break;
            }

        }while (opcion!=5);
    }
    static void multiplication_tables(){
        Scanner obtenerNumero = new Scanner(System.in);
        int numero,i,j;

        System.out.print("\n\nMade by \n\nPablo Bustillos\n\n");
        System.out.print("indicates the multiplication table: ");
        numero = obtenerNumero.nextInt();
        if (numero%2==0){
        System.out.println(numero+"\nit's even\n\n");
       }else {
        System.out.println(numero+"\nit's odd\n\n");
       }
 
 
            for(j = 1; j <= 10; j++)
            {
                System.out.println(numero + " X " + j + " = " + numero*j);
            }
            System.out.println();


    }
    static void Odd_and_even_numbers(){
        Scanner teclado = new Scanner(System.in);
        int n;

        System.out.println("Please enter the number to evaluate\n");
        n = teclado.nextInt();
        if (n % 2 == 0){
            System.out.println(n+"\nit's even\n\n");
        } else {
            System.out.println(n+"\nit's odd\n\n");
        }


    }
}