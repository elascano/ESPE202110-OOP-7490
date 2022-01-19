import java.util.Scanner;

public class multiplicationTable
{
    public static void main(String[] ARGS)
    {
        Scanner getInput = new Scanner(System.in);
        int number,i,j;

        boolean continu = true;
        while (continu){
            System.out.print("\nDo you want to continue ");

            System.out.println("S / N ");
            String opc = getInput.next();
            if (opc.equals("s") || opc.equals("S")) {

                System.out.print("choose a number for the multiplication table: ");
                number = getInput.nextInt();

                if (number % 2 != 0) {
                    System.out.println("\nThe number is odd\n");
                } else {
                    System.out.println("\nThe number is even\n");
                }

                for(j = 1; j <= 12; j++)
                {
                    System.out.println(number + " X " + j + " = " + number*j);
                }
                System.out.println();
            }else{
                continu=false;
            }
        }
    }
}