import java.util.Scanner;
import static java.lang.System.exit;

public class MultiplicationTable {
    public static void main(String[]args)
    { 
        Integer option=0;
        while (option != 2) 
        {
        System.out.println("\n     ----Multiplication Table Calculator----     \n");
        System.out.println("Type 1 = Multiplication tables");
        System.out.println("Type 0 = End of program\n");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        option = Integer.parseInt(text);
            if (option == 1) 
            {
                System.out.println("\nType a number");
                scanner = new Scanner(System.in);
                text = scanner.next();
                Integer number = Integer.parseInt(text);
                Integer repeat = 1;
                int i;
                for (i = 1; i <= 12; i++) 
                {
                    System.out.println(repeat + " x " + number + " = " + repeat * number);
                    repeat = repeat + 1;
                }
                if (number % 2 == 0) {
                    System.out.println("\nIt's even\n");
                } else {
                    System.out.println("\nIt's odd\n");
                }         
            }
            else 
            {
                if (option == 0) 
                {
                    exit(0);
                } 
            }
        }
    } 
}