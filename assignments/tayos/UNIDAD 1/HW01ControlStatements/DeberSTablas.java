import java.util.Scanner;
 
public class DeberSTablas{
    public static void main(String[] ARGS)
    {
        Scanner read=new Scanner(System.in);
		int option,number,i,j;
		
		System.out.println("Choose the function: \n");
		System.out.println("1. Multiplication Tables: \n");
		System.out.println("2. Know if it's even or odd: \n");
		System.out.println("3. both of the options: \n");
		option = read.nextInt();
		
		switch(option){
			case 1:
				Scanner getNumber = new Scanner(System.in);
				System.out.print("Choose the multiplication table: ");
				number = getNumber.nextInt();
				for(j = 1; j <= 10; j++)
				{
					System.out.println(number + " X " + j + " = " + number*j);
				}
				System.out.println();
			break;
			case 2:
				Scanner keyboard = new Scanner( System.in );
				System.out.printf( "Choose Integers numbers: " );
				number = keyboard.nextInt();

				if ( number % 2 == 0 ){
				System.out.printf( "Its Pair" );
				} else {
				System.out.printf( "Its not pair" );
				}
			break;
			case 3:
				Scanner keyboard2 = new Scanner(System.in);
				System.out.printf( "Put an Integer number: " );
				number = keyboard2.nextInt();
				for(j = 1; j <= 10; j++)
				{
					System.out.println(number + " X " + j + " = " + number*j);
				}
				System.out.println();
				if ( number % 2 == 0 ){
				System.out.printf( "Its an even number" );
				} else {
				System.out.printf( "Its an odd number" );
				}
			break;
		}
    }
}