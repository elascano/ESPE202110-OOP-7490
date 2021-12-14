import java.util.*;

public class TablaMultiplicar {

    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a whole number: ");                                                         
        n = sc.nextInt();
        if ( n % 2 == 0 )
        {
            System.out.printf( "\nIs even\n" );
        }
        else
        {
            System.out.printf( "\nIs uneven\n" );
        }
        System.out.println("Table of " + n);
        for(int i = 1; i<=12; i++){
             System.out.println(n + " * " + i + " = " + n*i);

        }
    }
}