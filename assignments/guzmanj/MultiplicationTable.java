import java.util.Scanner;
public class MultiplicationTable {
	public static void main(String [] args){
		System.out.println("\nHello, what multiplication table would you like to see? \n");
		Scanner sc= new Scanner(System.in);	
		int numero=0;
		do
		{
			numero=sc.nextInt();
			if(numero!=0){
				System.out.println("Multiplication Table -> " + numero);
			for(int i=1; i<=12; i++){
				System.out.println(numero + " x " + i + " = " + (numero*i));
				}if(numero%2==0)
				{
					System.out.println("The number is even");
				}
				else{	
					System.out.println("The number is odd");
					}
				System.out.println("Introduce another number or 0 for exit");
				}
		}while(numero!=0);
	}
}