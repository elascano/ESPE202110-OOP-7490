import java.util.*;

public class multiplication{

    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("\nIntroduce a number to calculate the multiplication table: ");                                                         
        n = sc.nextInt();

        System.out.println("\nMultiplication table of the number" + n);

        for(int i = 1; i<=12; i++){
             System.out.println(n + " * " + i + " = " + n*i);                                                     
        }
    }
}
