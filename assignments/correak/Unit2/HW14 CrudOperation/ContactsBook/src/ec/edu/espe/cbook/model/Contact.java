/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cbook.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import static jdk.nashorn.internal.runtime.Debug.id;

/**
 *
 * @author USUARIO
 */
public class Contact {

    public Contact(int id, String name, String hobby, int cellPhoneNumber, String sex, String group, float salary, Date birthDate, String coments) {
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
    
     
    private int id ;
    private String name;
    private String hobby;
    private int cellPhoneNumber;
    private String sex;
    private String group;
    private float salary;
    private Date birthDate;
    private String coments;

   

//    @Override
//    public String toString() {
//        return "{" + "id "+":" + id + ", name "+":" + name + ", hobby "+":" + hobby + ", cellPhoneNumber "+":" + cellPhoneNumber + ", sex "+":" + sex + ", group "+":" + group + ", salary "+":" + salary + ", birthDate "+":" + birthDate + ", coments "+":" + coments + '}';
//    }
    
    
    

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

    public int getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(int cellPhoneNumber) {
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    

    public String getComents() {
        return coments;
    }

    public void setComents(String coments) {
        this.coments = coments;
    }
       
    
    
}
