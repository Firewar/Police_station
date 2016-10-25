/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package police_station;

/**
 *
 * @author Aleksandr
 */
public class Policeman { 
    private String name;
    private String surname;
    private String rank;
    private Integer salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Policeman(String name, String surname, String rank, Integer salary) {
        this.name = name;
        this.surname = surname;
        this.rank = rank;
        this.salary = salary;
        
    }

    @Override
    public String toString() {
        return "\n Полицейский:"+ "\n имя:" + name + "\n фамилия:" + surname + "\n звания:" + rank + "\n зарплата: " + salary +" EURO";
    }


   
}
