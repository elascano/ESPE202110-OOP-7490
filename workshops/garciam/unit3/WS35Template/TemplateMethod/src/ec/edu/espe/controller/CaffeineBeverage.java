
package ec.edu.espe.controller;

/**
 *
 * @author Mayerly Garcia
 */
public abstract class CaffeineBeverage {
  void prepareRecipe(){
      boilWater();
      brew();
      pourlnCup();
      if(wantsCondiments()){addCondiments();}
    
}
void boilWater(){System.out.println("Boilin water");}
abstract void brew();
void pourlnCup(){System.out.println("Pouring into cup");}
abstract void addCondiments();
boolean wantsCondiments(){return true;}
}