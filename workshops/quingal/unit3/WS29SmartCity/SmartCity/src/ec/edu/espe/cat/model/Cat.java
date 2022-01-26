/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cat.model;

/**
 *
 * @author Usuario
 */
public class Cat {
    private int id;
    private String name;
    private int race;
    private String age;
    private boolean weight;
    private String adoption;

    @Override
    public String toString() {
        return "Cat{" + "id=" + id + ", name=" + name + ", race=" + race + ", age=" + age + ", weight=" + weight + ", adoption=" + adoption + '}';
    }

    public Cat(int id, String name, int race, String age, boolean weight, String inAdoption) {
        this.id = id;
        this.name = name;
        this.race = race;
        this.age = age;
        this.weight = weight;
        this.adoption = adoption;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRace() {
        return race;
    }

    public void setRace(int race) {
        this.race = race;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public boolean isWeight() {
        return weight;
    }

    public void setWeight(boolean weight) {
        this.weight = weight;
    }

    public String getInAdoption() {
        return adoption;
    }

    public void setAdoption(String adoption) {
        this.adoption = adoption;
    }
    
    
    
    
}
