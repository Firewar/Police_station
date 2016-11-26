
package police_station;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Aleksandr
 */
public class Police_start {

    
    public static void main(String[] args) {
          Policeman policeman1 = new Policeman ("Anna","Kaise","Sergent",1000);
        Policeman policeman2 = new Policeman ("Anton","Belov","corporal",1500);
        Policeman policeman3 = new Policeman ("Victor","Mailme","corporal",1500);
       Worker worker1 = new Worker("Zoja","Ivanova","cleaning woman",400,"SOL");
       Worker worker2 = new Worker("Olga","Domanova","cook",600,"no");
       Worker worker3 = new Worker("Sergei","Petrov","electric",700,"no");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PolicePU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
         tx.begin();
         tx.commit();
         em.persist(policeman1);
         em.persist(policeman2);
         em.persist(policeman3);
         em.persist(worker1);
         em.persist(worker2);
         em.persist(worker3);
         tx.commit();
        em.close();
        emf.close();
    
    }

   
}

