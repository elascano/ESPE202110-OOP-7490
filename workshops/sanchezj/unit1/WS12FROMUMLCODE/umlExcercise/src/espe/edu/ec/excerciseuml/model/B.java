/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espe.edu.ec.excerciseuml.model;

/**
 *
 * @author José
 */
public class B {
  private C cs[ ];

    @Override
    public String toString() {
        
        String toReturn;
        toReturn = "B{" + "cs=";
                
        for(int i = 0; i < cs.length ; i++ ){
            toReturn = toReturn + "cs["+ i + "] --> " + cs[i] + "\n";
        }
        toReturn = toReturn + "} \n";
        return toReturn;
    }

  
  
    public B(C[] cs) {
        this.cs = cs;
    }

  
  
    /**
     * @return the cs
     */
    public C[] getCs() {
        return cs;
    }

    /**
     * @param cs the cs to set
     */
    public void setCs(C[] cs) {
        this.cs = cs;
    }

    
}
