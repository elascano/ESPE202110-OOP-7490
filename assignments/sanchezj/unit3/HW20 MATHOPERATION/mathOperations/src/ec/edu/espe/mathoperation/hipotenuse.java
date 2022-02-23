/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mathoperation;

/**
 *
 * @author Jose Sanchez, DEEL-ESPE
 */
public class hipotenuse {
       public double calculate(double opoleg, double adjleg){
        double hipotenuse;
        hipotenuse = ( Math.sqrt(Math.pow(opoleg,2)+ Math.pow(adjleg,2))) ;
        return hipotenuse;
       }
}
