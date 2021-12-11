/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Examen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                String title;    
    String author;
    String publisher;
    int price;
    Double year;
    int quantity = 0;
       
    System.out.println("please enter the quantity books");
    quantity = scanner.nextInt();

        do
        {
            System.out.println("Book " + quantity);
            
            System.out.println("please enter the name of the book");
            title = scanner.nextLine();
            System.out.println("please enter the author's name");
            author= scanner.nextLine();
            System.out.println("please enter the price");
            price = scanner.nextInt();
            System.out.println("please enter the year of publication");
            year = scanner.nextDouble();
            
            System.out.println("the title of the book is --> "+ title +"; the author of the book is --> "+ author +"; the price of the book is --> "+ price + ";the year of publication of the book is --> "+ year);
            
               quantity ++;
      }
        while (quantity <= 5);
    }
    
}
