package hellooop;

/**
 *
 * @author elascano
 */
public class HelloOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("---- Hello from Edison Lascano ----");

        int addend1;
        int addend2;
        int sum;

        addend1 = 10;
        addend2 = 20;

        sum = addend1 + addend2;

        System.out.println(" *********************");
        System.out.println("The sum of " + addend1 + " + " + addend2 + " is -> " + sum);

        if (addend1 < 0) {
            System.out.println("This is a negative addend");
        }

        //primitive data types
        int numberOfwheels;

        //DT  variable 
        float salary;
        char option;
        //long short boolean ...
        
        String name;

        //ADT (class)    variable (object)
        Employer         employer;
        Owner            owner;
        Address          address;
        Vehicle          vehicle; //declaring the object
        Manufacturer     manufacturer;
        MpgRating        mpgRating;
        
        
        vehicle = new Vehicle(); //intance (instantiation)
        f(x)
        
        //class object        contructor
        //ADT   variable      method to instantiate         
        Vehicle vehicle = new Vehicle();
        
        
        
        
        
        
        
        Address address = new Address("montecristi","123");
        
        
        
        
        System.out.println(vehicle);
        vehicle.getModel();
        
        
        
        
        
        
        
        
        
        
        
    }

}
