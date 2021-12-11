package MultiplicationTables;

import java.util.Scanner;

public class MultiplicationTables {

    public static void main(String[] args) {

        Scanner getNumber = new Scanner(System.in);
        Scanner getOption = new Scanner(System.in);
        int number, n, option;

        System.out.println("the number is even or odd?");
        System.out.println("1. Even \n2.Odd");

        option = getOption.nextInt();

        if (option == 1) {
            System.out.println("the number is even");
            System.out.println("multiplication table");
            number = getNumber.nextInt();
            for (int i = 1; i <= 12; i++) {
                System.out.println(number + "x" + i + "=" + number * i);
            }
        } else if (option == 2) {
            System.out.println("the number is odd");
            System.out.println("multiplication table");
            number = getNumber.nextInt();
            for (int i = 1; i <= 12; i++) {
                System.out.println(number + "x" + i + "=" + number * i);
            }
        } else {
            System.out.println("the option is incorrect, select again");
        }

    }

}