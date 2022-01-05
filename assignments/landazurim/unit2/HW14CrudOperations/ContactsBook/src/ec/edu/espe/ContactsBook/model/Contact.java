/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.ContactsBook.model;

import java.time.LocalDate;

/**
 *
 * @author Mateo Landazuri OOP
 */
public class Contact {
    private String id;
    private String name;
    private String hobby;
    private String cellPhoneNumber;
    private String sex;
    private String group;
    private String salary;
    private String birthDate;
    private String comments;

    public Contact(String id, String name, String hobby, String cellPhoneNumber, String sex, String group, String salary, String birthDate, String comments) {
        this.id = id;
        this.name = name;
        this.hobby = hobby;
        this.cellPhoneNumber = cellPhoneNumber;
        this.sex = sex;
        this.group = group;
        this.salary = salary;
        this.birthDate = birthDate;
        this.comments = comments;
    }
    
    
    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the hobby
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * @param hobby the hobby to set
     */
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    /**
     * @return the cellPhoneNumber
     */
    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    /**
     * @param cellPhoneNumber the cellPhoneNumber to set
     */
    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the group
     */
    public String getGroup() {
        return group;
    }

    /**
     * @param group the group to set
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * @return the salary
     */
    public String getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(String salary) {
        this.salary = salary;
    }

    /**
     * @return the birthDate
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    
    
}
