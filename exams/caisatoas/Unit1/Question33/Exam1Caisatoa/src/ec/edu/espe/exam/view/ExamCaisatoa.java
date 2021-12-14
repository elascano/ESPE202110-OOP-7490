
package ec.edu.espe.exam.view;

import java.util.Scanner;

/**
 *
 * @author Caisatoa
 */
public class ExamCaisatoa {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String author;
        int year;
        int price;
        int iva;
        float total;
        
        
        System.out.println("Enter please ID ");
        
        System.out.println("please enter the tittle ");
        String tittle = scanner.nextLine();
        
        System.out.println("please enter the author's name ");
        author = scanner.nextLine();
       
        System.out.println("plese enter the publisher: ");
        String publisher = scanner.nextLine();
        
        System.out.println("please enter the price");
        price = scanner.nextInt();

        System.out.println("please enter the year of publication");
        year = scanner.nextInt();
        
        iva= (int) (price * 0.12);
        total = iva +price;
              
        System.out.println("The tittle "+ tittle +"; The autor is " + author + "; the publisher is " + publisher + "; the price include IVA is "+ total+ "; the year publication is: " + year);
    }
}
