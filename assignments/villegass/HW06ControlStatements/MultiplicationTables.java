import static java.lang.System.exit;
import java.util.Scanner;


public class MultiplicationTables {

    public static void main(String[]args)
    { 
        Integer option=0;
        while (option != 2) 
        {
        System.out.println("Multiplication Table Calculator");
        System.out.println("Option 1 Continue with the operation\nOption 2 Exit");
        System.out.println("Start");
        
        Scanner scanner = new Scanner(System.in);
        String opcionTexto = scanner.next();
        option = Integer.parseInt(opcionTexto);
        
            if (option == 1) 
            {
                System.out.println("Type a number");
                scanner = new Scanner(System.in);
                opcionTexto = scanner.next();
                Integer number = Integer.parseInt(opcionTexto);
                
                Integer repeat = 1;
                int i;
                for (i = 1; i <= 12; i++) 
                {
                    System.out.println(repeat + " x " + number + " = " + repeat * number);
                    repeat = repeat + 1;
                }
                
                if (number % 2 == 0) {
                    System.out.println("It's even");
                } else {
                    System.out.println("It's odd");
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
    