package ec.espe.edu.catering.model;

import java.util.ArrayList;

/**
 *
 * @author Joel Zeas
 */
public class Stock {
    
    private String name;
    private String components;
    private ArrayList<Menu> menus;
    private Menu menu = new Menu();

        public int checkthequantity()
    {
        return menus.size();
    }
    
    public void remove(Menu menu){
    menus.remove(components);
    }
    
    public void add(){ 
       
       menus.add(menu);
   }
    
    public void seeifthereisinstock(){
        menus.toString();
                 
    }
    
    public void find(){
        menus.contains(components);
    }
    
    
    public Stock(String name, String components, ArrayList<Menu> menus) {
        this.name = name;
        this.components = components;
        this.menus = menus;
    }
    
}


