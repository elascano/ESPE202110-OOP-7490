/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hellooop;

/**
 *
 * @author Cesar Calderon
 */
public class HelloOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello from Andy Calderon");
        int addend1;
        int addend2;
        int sum;

        addend1 = 10;
        addend2 = 20;

        sum = addend1 + addend2;

        System.out.println("*********");
        System.out.println("The sum of " + addend1 + " + " + addend2 + " is-> " + sum);
        if (addend1<0){
            System.out.println("This is a negative addend");
        }
    }
    
}
