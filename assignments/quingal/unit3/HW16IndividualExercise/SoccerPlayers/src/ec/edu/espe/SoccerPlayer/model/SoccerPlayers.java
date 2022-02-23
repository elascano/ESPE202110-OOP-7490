/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.SoccerPlayer.model;

/**
 *
 * @author Usuario
 */
public class SoccerPlayers {
    private int id;
    private String name;
    private int edad;
    private String country;
    private String soccerTeam;

    @Override
    public String toString() {
        return "SoccerPlayers{" + "id=" + id + ", name=" + name + ", edad=" + edad + ", country=" + country + ", soccerTeam=" + soccerTeam + '}';
    }        

    public SoccerPlayers(int id, String name, int edad, String country, String soccerTeam) {
        this.id = id;
        this.name = name;
        this.edad = edad;
        this.country = country;
        this.soccerTeam = soccerTeam;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSoccerTeam() {
        return soccerTeam;
    }

    public void setSoccerTeam(String soccerTeam) {
        this.soccerTeam = soccerTeam;
    }
    
    
}
