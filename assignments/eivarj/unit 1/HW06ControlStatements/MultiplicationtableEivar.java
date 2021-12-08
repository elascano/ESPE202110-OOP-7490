import java.util.Scanner;
 
public class MultiplicationtableEivar{
    public static void main(String[] ARGS)
    {
        Scanner read=new Scanner(System.in);
		int option,number,i,j;
		
		System.out.println("choose a option: \n");
		System.out.println("1. Multiplication table: \n");
		System.out.println("2. know par or impar: \n");
		System.out.println("3. Choose the two options: \n");
		option = read.nextInt();
		
		switch(option){
			case 1:
				Scanner givenumber = new Scanner(System.in);
				System.out.print("press the multiplication table: ");
				number = givenumber.nextInt();
				for(j = 1; j <= 10; j++)
				{
					System.out.println(number + " X " + j + " = " + number*j);
				}
				System.out.println();
			break;
			case 2:
				Scanner keyword = new Scanner( System.in );
				System.out.printf( "Press a number: " );
				number = keyword.nextInt();

				if ( number % 2 == 0 ){
				System.out.printf( " PAR" );
				} else {
				System.out.printf( " IMPAR" );
				}
			break;
			case 3:
				Scanner keyword2 = new Scanner(System.in);
				System.out.printf( "Press a enter number: " );
				number = keyword2.nextInt();
				for(j = 1; j <= 10; j++)
				{
					System.out.println(number + " X " + j + " = " + number*j);
				}
				System.out.println();
				if ( number % 2 == 0 ){
				System.out.printf( "PAR" );
				} else {
				System.out.printf( "IMPAR" );
				}
			break;
		}
    }
}