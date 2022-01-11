import static java.lang.System.exit;
import java.util.Scanner;

public class Tarea1 
{
    public static void main(String[] args) {

        int option = 0;
        while (option != 2) {

        //Menu opciones//////////////////

            System.out.println("////////SELEC OPTION///////////////");
            System.out.println("1.Multiplication Table\n2.-Exit"); 
            System.out.println("///////////////////////////////////");
            Scanner scanner = new Scanner(System.in);
            option = Integer.parseInt(scanner.next());

            if(option==2)
            {
                System.out.println("Exit");
                exit(0);
            }

            System.out.println("Enter the number: ");
            Integer number = Integer.parseInt(scanner.next());
            
            for(int j =1;j<=12;j++)
            {
                System.out.println(number+" x "+j+" = "+(number*j));
            }
            
            if (number % 2==0){
                System.out.println("The number is even");
            }
            else{
                System.out.println("The number is odd");
            }   
        }        
    }
    
}
