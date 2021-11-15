import java.util.*;

public class Multiplicationtable {

    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("press a number: ");                                                         
        n = sc.nextInt();
        System.out.println("table of " + n);
        for(int i = 1; i<=10; i++){
             System.out.println(n + " * " + i + " = " + n*i);                                                     
        }
    }
}