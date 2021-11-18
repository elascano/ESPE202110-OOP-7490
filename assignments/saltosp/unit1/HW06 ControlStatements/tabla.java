
import java.util.Scanner;
 
public class Multiplicationtable{
    public static void main(String[] ARGS)
    {
        Scanner leer=new Scanner(System.in);
		int option,number,i,j;
		
		System.out.println("Choose the function: \n");
		System.out.println("1. Multiplicationtable : \n");
		System.out.println("2. Knowing is Odd or Even: \n");
		System.out.println("3. The 2 options: \n");
		option = leer.nextInt();
		
		switch(option){
			case 1:
				Scanner GetNumber = new Scanner(System.in);
				System.out.print("indicates the multiplication table: ");
				number = GetNumber.nextInt();
				for(j = 1; j <= 10; j++)
				{
					System.out.println(number + " X " + j + " = " + number*j);
				}
				System.out.println();
			break;
			case 2:
				Scanner keyboard = new Scanner( System.in );
				System.out.printf( "Enter a number from the multiplication table : " );
				number = keyboard.nextInt();

				if ( number % 2 == 0 ){
				System.out.printf( "he multiplication table is Even" );
				} else {
				System.out.printf( "The multiplication table is Odd" );
				}
			break;
			case 3:
				Scanner keyboard2 = new Scanner(System.in);
				System.out.printf( "Enter a number from the multiplication table: " );
				number = keyboard2.nextInt();
				for(j = 1; j <= 10; j++)
				{
					System.out.println(number + " X " + j + " = " + number*j);
				}
				System.out.println();
				if ( number % 2 == 0 ){
				System.out.printf( "the multiplication table is Even" );
				} else {
				System.out.printf( "the multiplication table is Odd" );
				}
			break;
		}
    }
}