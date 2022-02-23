/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.smartCity.model;

/**
 *
 * @author Usuario
 */
public class Cat {
    private int id;
    private String name;
    private String breed;
    private int age;
    private float weight;
    private String dateOfBirtch;
    private String sex;
    private String adoption;

    public Cat(int id, String name, String breed, int age, float weight, String dateOfBirtch, String sex, String adoption) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.dateOfBirtch = dateOfBirtch;
        this.sex = sex;
        this.adoption = adoption;
    }


    @Override
    public String toString() {
        return "Cat{" + "id=" + id + ", name=" + name + ", breed=" + breed + ", age=" + age + ", weight=" + weight + ", dateOfBirtch=" + dateOfBirtch + ", sex=" + sex + ", adoption=" + adoption + '}';
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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getDateOfBirtch() {
        return dateOfBirtch;
    }

    public void setDateOfBirtch(String dateOfBirtch) {
        this.dateOfBirtch = dateOfBirtch;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAdoption() {
        return adoption;
    }

    public void setAdoption(String adoption) {
        this.adoption = adoption;
    }
   

   
}
