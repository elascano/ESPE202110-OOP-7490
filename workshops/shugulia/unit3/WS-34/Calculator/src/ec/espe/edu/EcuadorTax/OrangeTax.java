
package ec.espe.edu.EcuadorTax;

import java.util.Scanner;

/**
 *
 * @author Alan Shuguli , DEEE-ESPE
 */
public class OrangeTax {          //Tax is 6.00%
    private static OrangeTax instance;
    private OrangeTax(){}
    
    public static OrangeTax getInstance() {
        if(instance == null)
            instance = new OrangeTax();
        
        return instance;
    }

    public float salesTotal() {
                
        Scanner sc = new Scanner(System.in);
        double precioUnidad, cantidad, iva, precioSinIva, totalIva;

        System.out.print("Introduzca precio por unidad del producto: ");                                          
        precioUnidad = sc.nextDouble();

        System.out.print("Introduzca número de productos vendidos: ");
        cantidad = sc.nextDouble();

        System.out.print("Introduzca %IVA: ");
        iva = sc.nextDouble();

        precioSinIva = precioUnidad * cantidad;
        totalIva = precioSinIva * iva / 100;

        System.out.println("Precio de venta -> " + (precioSinIva + totalIva));
        return 0;
    }
}
