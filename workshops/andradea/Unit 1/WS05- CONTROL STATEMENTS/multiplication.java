import java.util.Scanner;

public class Multiplication {
	public static void main(String [] args){
		System.out.println("\nHello, please enter a number to observe the multiplication table that corresponds to it  \n");
		Scanner mt= new Scanner(System.in);
		int ns=0;
		do
		{
			ns=mt.nextInt();
			if (ns !=0){
				System.out.println("\n Multiplication table -> \n"+ ns);
			for(int i=1; i<=12; i++){
				System.out.println(ns + "x" + i + "=" +(ns*i));
				}if (ns %2==0)
				{
					System.out.println("\n This number is even \n");
				}
				else{
					System.out.println("\n This number is odd \n");
					}
			System.out.println("\n Introduce a new number or select the 0 for exit \n");	
			}
			
		}while(ns!=0);
	}
}