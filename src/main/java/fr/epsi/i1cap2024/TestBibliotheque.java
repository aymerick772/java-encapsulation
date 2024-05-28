package fr.epsi.i1cap2024;

import fr.epsi.i1cap2024.bo.Client;
import fr.epsi.i1cap2024.bo.Emprunt;
import fr.epsi.i1cap2024.bo.Livre;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Set;

public class TestBibliotheque {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo-jpa");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();

//        Client client = entityManager.find(Client.class, 2);
//
//        if (client != null) {
//            Set<Emprunt> emprunts = client.getEmprunt();
//            if (emprunts.isEmpty()) {
//                System.out.println("Le client n'a aucun emprunt associé.");
//            } else {
//                System.out.println("Liste des emprunts du client : ");
//                for (Emprunt emprunt : emprunts) {
//                    System.out.println(emprunt.toString());
//                }
//            }
//        } else {
//            System.out.println("Aucun client trouvé avec l'ID 2.");
//        }


        Livre newLivre = new Livre();
        newLivre.setTitre("test");
        newLivre.setAuteur("test");
        entityManager.persist(newLivre);
        entityManager.getTransaction().commit();

        entityManager.close();
        emf.close();
    }
}
