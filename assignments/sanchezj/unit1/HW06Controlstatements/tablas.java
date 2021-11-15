import java.util.Scanner;

public class Deber1Oop {

    public static void main(String[] args) 
    {
        System.out.println("Ingrese un número");
        Scanner scanner=new Scanner (System.in);
        //scanner.next permite leer los datos desde la consola
        String opcionTexto=scanner.next();
        //convertir de texto a numero
        Integer number = Integer.parseInt(opcionTexto);
////////////////////1ra parte////////////////////////
        Integer repeat = 1;
        int i;
        for (i = 1; i <= 12; i++) 
        {
            System.out.println(repeat + " x " + number + " = " + repeat * number);
            repeat = repeat + 1;
        }      
//////////////////////2da parte////////////////////////       
        if( number % 2 == 0) 
        {
            System.out.println("IT IS EVEN");
        } 
        else 
        {
            System.out.println("IT IS OOD");
        }
///////////////////3era parte////////////////////////////        
        
    }
}