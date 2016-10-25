/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package police_station;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aleksandr
 */
public class Police_start {

    
    public static void main(String[] args) {
         Policeman policeman1 = new Policeman ("Anna","Kaise","Sergent",1000);
         Policeman policeman2 = new Policeman ("Anton","Belov","corporal",1500);
         Policeman policeman3 = new Policeman ("Victor","Mailme","corporal",1500);
         List<Policeman> policemen = new ArrayList();
         policemen.add(policeman1);
         policemen.add(policeman2);
         policemen.add(policeman3);
        Worker worker1 = new Worker("Zoja","Ivanova","cleaning woman",400,"SOL");
        Worker worker2 = new Worker("Olga","Domanov","cook",600,"no");
        Worker worker3 = new Worker("Sergei","Petrov","electric",700,"no");
        List<Worker> workers=new ArrayList();
         workers.add(worker1);
         workers.add(worker2);
         workers.add(worker3);
        System.out.println(policemen.toString());
        System.out.println(workers.toString());
        
    
    }
}

