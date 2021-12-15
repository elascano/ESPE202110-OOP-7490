import java.util.Scanner;
 
public class multiplication2
{
    public static void main(String[] ARGS)
    {
        Scanner getNumber= new Scanner(System.in);
        int number,i,n;

        System.out.println("enter any number: ");
        number = getNumber.nextInt();
        if(number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");                                                   
        }
 
        System.out.print("what table do you want to see?: ");
        number = getNumber.nextInt();
 
        for(i = 1; i<=number; i++)
        {
            for(n = 1; n<= 12; n++)
            {
                System.out.println(i + " X " + n + " = " + i*n);
            }
            System.out.println();

        
        }
    }
} 
