import static java.lang.System.exit;
import java.util.Scanner;

public class DeberTablas 
{
    public static void main(String[] args) 
    {
        Integer option = 0;
        while (option != 2) 
        {
            System.out.println("---------------------------");
            System.out.println("1.-Continue\n2.-Exit");
            System.out.println("---------------------------");

            Scanner scanner = new Scanner(System.in);
            //scanner.next permite leer los datos desde la consola
            String opcionTexto = scanner.next();
            //convertir de texto a numero
            option = Integer.parseInt(opcionTexto);

            if (option == 1) 
            {
                System.out.println("Enter a number");
                scanner = new Scanner(System.in);
                //scanner.next permite leer los datos desde la consola
                opcionTexto = scanner.next();
                //convertir de texto a numero
                Integer number = Integer.parseInt(opcionTexto);

                Integer repeat = 1;
                for (int i = 1; i <= 12; i++)
                {
                    System.out.println(repeat + " x " + number + " = " + repeat * number);
                    repeat = repeat + 1;
                }

                if (number % 2 == 0)
                {
                    System.out.println("IT IS EVEN");
                } 
                else 
                {
                    System.out.println("IT IS OOD");
                }
            } 
            else 
            {
                if (option == 2) 
                {
                    exit(0);

                }

            }
        }

    }

}
