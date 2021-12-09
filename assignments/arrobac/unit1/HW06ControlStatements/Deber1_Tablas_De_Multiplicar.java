public class multiplicationtable {

    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a whole number: ");                                                         
        n = sc.nextInt();
        System.out.println("Table of " + n);
        for(int i = 1; i<=10; i++){
             System.out.println(n + " * " + i + " = " + n*i);                                                     
        }
    }
}