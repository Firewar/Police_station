
package police_station;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="worker")
/**
 *
 * @author Aleksandr
 */
public class Worker {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String  Name;
    private String Surname;
    private String post;
    private Integer salary;
    private String  outsourcingfirma;

    public Worker(String Name, String Surname, String post, Integer salary, String outsourcingfirma) {
        this.Name = Name;
        this.Surname = Surname;
        this.post = post;
        this.salary = salary;
        this.outsourcingfirma = outsourcingfirma;
    }

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Worker{" + "Name=" + Name + ", Surname=" + Surname + ", post=" + post + ", salary=" + salary + ", outsourcingfirma=" + outsourcingfirma + '}';
    }
    
}