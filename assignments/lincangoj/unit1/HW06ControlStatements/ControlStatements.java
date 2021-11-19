/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlstatements;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author MATRIZ PC
 */
public class ControlStatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int value = 0;
        while (value != 2) {
            System.out.println("xxxxxxxxxxxxxxxxx");
            System.out.println("1.-Continue\n2.-Exit");
            System.out.println("xxxxxxxxxxxxxxxxx");

            Scanner scanner = new Scanner(System.in);
            String opcionTexto = scanner.next();
            value = Integer.parseInt(opcionTexto);
            if (value == 1) {
                System.out.println("ENTER A NUMBER TO PERFORM THE OPERATION: ");
                scanner = new Scanner(System.in);
                opcionTexto = scanner.next();
                Integer number = Integer.parseInt(opcionTexto);

                Integer repeatValue = 1;
                for (int i = 1; i <= 12; i++) {
                    System.out.println(repeatValue + "x" + number + "=" + repeatValue * number);
                    repeatValue = repeatValue + 1;
                }
                if (number % 2 == 0) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }

            } else {
                if (value == 2) {
                    exit(0);
                }
            }
        }
    }
    
}
