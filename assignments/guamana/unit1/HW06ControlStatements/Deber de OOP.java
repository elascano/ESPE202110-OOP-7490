
package tabal.de.multiplicar.y.par.o.impar;
    import java.util.Scanner;


 
public class TabalDeMultiplicarYParOImpar {
            static Scanner scanner =new Scanner(System.in);


    public static void main(String[] args) {
   
       
        int opcion = 0;
            do {

            System.out.println("\n Bienvenio/a al siguiente menu de opciones");
            System.out.println("\n Digite --1-- para conocer la tabla de multiplicar  de cualquier numero ");
            System.out.println("\n Digite --2-- para conocer si es par o impar ");
            System.out.println("\n Digite --3-- para salir");
                System.out.println("\n Porfavor ingrese la opcion");
               opcion= scanner.nextInt();
                
            

                 switch (opcion){
                case 1:
                    mostrar();
                    break;
                case 2:
                    par();
                    break;
                 }
                
            } while(opcion!=3);
            System.out.println("\n El programa ha finalizado ....gracias");
             
            
    }
        static void mostrar() {
        
        System.out.println("\n Porfavor ingrese que el numero de la tabla que quiere conocer ");
        int numero1 = scanner.nextInt();
            System.out.println("\n La tabla del numero  ingresado es ----->");
            int i;
            for(i=1;i<=11;i++)
            {
                int multi= numero1*i;
                System.out.println("\n "+numero1+" * "+i+" ="+multi);
            }
            }
        static void par() {
            int n;
            System.out.println("\n Porfavor ingresar el un numero a ser evaluado");
            n = scanner.nextInt();
            if(n % 2 ==0) {
                System.out.println("\n El numerop es par 2");
                
            }
            if (n%3 ==0) {
                System.out.println("\n EL numero es Impar");
            }
            
            
        }
    }

       
   