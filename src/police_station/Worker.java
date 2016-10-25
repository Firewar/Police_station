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
public class Worker {
    private String  Name;
    private String Surname;
    private String post;
    private Integer salary;
    private String  outsourcingfirma;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getOutsourcingfirma() {
        return outsourcingfirma;
    }

    public void setOutsourcingfirma(String outsourcingfirma) {
        this.outsourcingfirma = outsourcingfirma;
    }

    public Worker(String Name, String Surname, String post, Integer salary, String outsourcingfirma) {
        this.Name = Name;
        this.Surname = Surname;
        this.post = post;
        this.salary = salary;
        this.outsourcingfirma = outsourcingfirma;
    }

    @Override
    public String toString() {
        return "\n Рабочий:" + "\n Имя:" + Name + "\n Фамилия " + Surname + "\n должность:" + post + "\n зарплата:" +"\n euro: "+ salary +"\n"+ outsourcingfirma+ "  - посредник";
    }
    
}
