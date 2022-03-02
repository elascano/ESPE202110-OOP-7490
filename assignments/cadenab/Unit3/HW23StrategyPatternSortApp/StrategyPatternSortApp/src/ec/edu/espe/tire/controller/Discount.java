
package ec.edu.espe.tire.controller;

/**
 *
 * @author Sebastian Caisatoa
 */
public class Discount {
    public float distance(float priceDiscount,float totalPrice){
            double product1, product2, productWithDiscount;     
            product1 = priceDiscount * totalPrice;
            product2 =  product1 / 100;
            productWithDiscount = totalPrice - product2;
            double productspecial = Math.round(productWithDiscount);
            return (float) productspecial;
    }
}
