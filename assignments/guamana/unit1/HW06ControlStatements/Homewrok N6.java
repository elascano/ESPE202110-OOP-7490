
package tabal.de.multiplicar.y.par.o.impar;
    import java.util.Scanner;


 
public class TabalDeMultiplicarYParOImpar {
            static Scanner scanner =new Scanner(System.in);


    public static void main(String[] args) {
   
       
        int opcion = 0;
            do {

            System.out.println("\n Welcome to the following options menu");
            System.out.println("\n Type --1-- to know the multiplication table of any number");
            System.out.println("\n Type --2-- to find out if it is odd or even");
            System.out.println("\n Type --3-- to exit");
                System.out.println("\n Please enter the option");
               opcion= scanner.nextInt();
                
            

                 switch (opcion){
                case 1:
                    mostrar();
                    break;
                case 2:
                    par();
                    break;
                 }
                
            } while(opcion!=3);
            System.out.println("\n The program has ended .... thank you");
             
            
    }
        static void mostrar() {
        
        System.out.println("\n Please enter the number of the table you want to know ");
        int numero1 = scanner.nextInt();
            System.out.println("\n The table of the number entered is ----->");
            int i;
            for(i=1;i<=11;i++)
            {
                int multi= numero1*i;
                System.out.println("\n "+numero1+" * "+i+" ="+multi);
            }
            }
        static void par() {
            int n;
            System.out.println("\nPlease enter the number to be evaluated");
            n = scanner.nextInt();
            if(n % 2 ==0) {
                System.out.println("\n The number is even");
                
            }
            if (n%3 ==0) {
                System.out.println("\n The number is Odd");
            }
            
            
        }
    }

       
   