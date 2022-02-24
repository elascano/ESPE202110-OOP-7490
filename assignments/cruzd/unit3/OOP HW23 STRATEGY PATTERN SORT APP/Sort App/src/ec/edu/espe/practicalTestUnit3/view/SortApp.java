package ec.edu.espe.practicalTestUnit3.view;

import ec.edu.espe.practicalTestUnit3.model.SortingContext;
import static java.lang.Character.getNumericValue;
import java.util.ArrayList;
import java.util.Scanner;
import org.bson.Document;

/**
 *
 * @author darling.cruz
 */

public class SortApp {

    public static void main(String args[]) {
        Scanner input;
        input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList();
        ArrayList<Integer> list = new ArrayList();
        System.out.print("how many numbers do you want: ");
        int cant = input.nextInt();

        for (int f = 0; f < cant; f++) {
            System.out.print("Put the numbers: ");
            numbers.add(input.nextInt());
        }
        String numUnOrder = "";
        for (int i = 0; i < numbers.size(); i++) {
            numUnOrder += numbers.get(i).toString() + " ";
        }
        System.out.println("Jumbled Numbers");
        System.out.println(numUnOrder);
        
        list = numbers;
        String algorit = "";
        SortingContext sortNumber = new SortingContext();
        sortNumber.setSortStrategy(list.size(), list);
        if (list.size() <= 3) {
            algorit = "Bubble sort";
        } else if (list.size() > 3 && list.size() <= 7) {
            algorit = "Insertion Sort";
        } else {
            algorit = "Quick Sort";
        }
        
        String numOrder = "";
        for (int i = 0; i < list.size(); i++) {
            numOrder += list.get(i).toString() + " ";
        }
        System.out.println("Ordered Numbers");
        System.out.println(numOrder);
        
        System.out.println("Algorithm used -> " + algorit);
    }


}
