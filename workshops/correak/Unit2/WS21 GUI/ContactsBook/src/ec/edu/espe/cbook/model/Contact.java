/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cbook.model;

import java.time.LocalDate;
import static jdk.nashorn.internal.runtime.Debug.id;

/**
 *
 * @author USUARIO
 */
public class Contact {
    private int id ;
    private String name;
    private String hobby;
    private String cellPhoneNumber;
    private String sex;
    private String group;
    private float salary;
    private LocalDate birthDate;
    private String coments;
    

    public Contact(int id, String name, String hobby, String cellPhoneNumber, String sex, String group, float salary, LocalDate birthDate, String coments) {
        this.id = id;
        this.name = name;
        this.hobby = hobby;
        this.cellPhoneNumber = cellPhoneNumber;
        this.sex = sex;
        this.group = group;
        this.salary = salary;
        this.birthDate = birthDate;
        this.coments = coments;
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

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getComents() {
        return coments;
    }

    public void setComents(String coments) {
        this.coments = coments;
    }
       
    
    
}
