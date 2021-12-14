import java.util.Scanner;
public class Numbers{
	public static void main(String[] args){
		int numero;
		int paroimpar;
		int opcion;
		boolean salir = false;

		Scanner sc = new Scanner(System.in);
		System.out.println("-- Correa Kerly -- \n");
		System.out.println("-- WELCOME -- \n");
		System.out.print("Enter the table you want to see: ");
		numero=sc.nextInt();
		System.out.println("\nThe table of the "+ numero +"\n");
		for(int i = 1; i<=15; i++) {
			        System.out.println( numero +" x " +i+ "=" + (numero*i));
            }

        System.out.print("\nEnter a number to find out if it is odd / even: ");
        paroimpar = sc.nextInt();

        if (numero % 2 == 0){
        	 System.out.println(paroimpar +" is an even number");
        }  else{
        	 System.out.println(paroimpar +" is an odd number");
        }

        do{
        System.out.println("\nWhat do you want to do:");
        System.out.println("1. Ask again the number for the multiplication table and the odd / even number. ");
        System.out.println("2. Exit \n ");

        System.out.print("Write your option: ");
        opcion = sc.nextInt();

        	switch (opcion){
        		case 1:
        			System.out.print("Enter the table you want to see: ");
					numero=sc.nextInt();
					System.out.println("\nThe table of the "+ numero +"\n");
					for(int i = 1; i<=10; i++) {
			        		System.out.println( numero +" x " +i+ "=" + (numero*i));
            		}

        			System.out.print("\nEnter a number to find out if it is odd / even: ");
        			paroimpar = sc.nextInt();

        			if (numero % 2 == 0){
        	 				System.out.println(paroimpar +" is an even number");
        			}  else{
        	 				System.out.println(paroimpar +" is an odd number");
        			}
        			break;
        		case 2:
        			salir = true;
        			break;

        		default:
        			System.out.println("\n The option does not exist!");
        		}

        	}
        	while(!salir);
        }
	}	

