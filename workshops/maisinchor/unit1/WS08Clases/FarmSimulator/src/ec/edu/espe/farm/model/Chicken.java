/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.model;

/**
 *
 * @author ALEXA
 */
public class Chicken {
 private String name;
    private String color;
    private int age;
    private boolean isMolting;
    
    private void doStuff(){
    }
    private void cluck(){
    }
    private void wander(){
    }
    private void eat(){
    }
    private void drink(){
    }
    private Poop poop(){
        return new Poop();
    }

    private static class Poop {

        public Poop() {
        }
    }
    private Egg layAntgg(){
        return new Egg();
    }

    private static class Egg {

        public Egg() {
        }
    }   
}
