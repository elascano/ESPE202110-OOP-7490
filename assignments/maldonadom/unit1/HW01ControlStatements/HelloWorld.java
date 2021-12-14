/*public class HelloWorld {
        public static void main(String [] args){
                System.out.println("\nHello Objects and Web Worlds from Mateo Maldonado\n");

                System.out.println("\n multiplication tables 5 \n");
                for(int i = 1; i<=12; i++){
                	System.out.println("5 x " + i + "=" + (i*5));
                }
        }
}*/
import java.util.Scanner;
public class HelloWorld 
{
        public static void main(String [] args)
        {
                System.out.println("\nHello Objects and Web Worlds from Mateo Maldonado\n");
        	Scanner lector = new Scanner(System.in);
        	
        	boolean salir = false;

                while(salir == false)
                {

        		int n;
                int m;
                int j;

        	System.out.println("Enter a number for the multiplication table");
        	n = lector.nextInt();

                for(int i =1; i <= 12; i++)
                {
                        System.out.println(n+" x "+i+" = "+n*i);
                }

                System.out.println("\nEnter a number for check if is odd or even ");
                m = lector.nextInt();

        	if (m % 2 == 0)
        	{
        		System.out.println("The number is even");
        	}
        	else
        	{
        		System.out.println("The number is odd");    
        	}
                System.out.println("\nCHOOSE A OPTION:");
                System.out.println("\n0. EXIT");
                System.out.println("1. REPEAT THE PROCESS\n");
                j = lector.nextInt();
                if (j == 0)
                {
                        salir = true;
                }
                }

        }
}