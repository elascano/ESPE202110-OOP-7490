
package chickenv1.pkg1;

/**
 *
 * @author DARK
 */
public class ChickenV11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Name name = new Name (System.in);
        Age age = new Age (System.in);
        String name="";
        String color="";
        int id = 0;
        int age = 0;
        boolean Molting;
        
        System.out.println("cual es el nombre?");
        name = name.nextLine();
        
        System.out.println("requerimos la edad de la gallina \n");
        System.out.println("cual es la edad de la gallina");
        age = age.nexInt();
        
        System.out.println("Acontinuacion requerimos el color de la gallina");
        System.out.println("cual es el color de la gallina \n");
        name = name.nextLine();
        
        System.out.println("requerimos id de la gallina \n");
        System.out.println("cual es el id de la gallina");
        id = id.nexInt();
        
        System.out.println("");
        
        name = (name);
        
        if(egg = 0){
            System.out.println("la gallina" + name + " ismolting");
            System.out.println("sin huevos " + egg);
        }else if(egg > 0){
            System.out.println("la gallina" + name + "not ismolting"  );
            System.out.println("egg > 0 " + egg);
        }
        }
}
