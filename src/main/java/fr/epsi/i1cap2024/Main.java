package fr.epsi.i1cap2024;

import fr.epsi.i1cap2024.bo.Fournisseur;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo-jpa");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        //Créate
//        Fournisseur fournisseurACreer = new Fournisseur("Capgemini");
//        entityManager.persist(fournisseurACreer);








        entityManager.getTransaction().commit();
        //read
//        Fournisseur fournisseur = entityManager.find(Fournisseur.class, 2);
//        System.out.println(fournisseur.getRaisonSocial());
//        System.out.println("testt2");





        entityManager.close();
        emf.close();





    }
}