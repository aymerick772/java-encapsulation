package fr.epsi.i1cap2024;

import fr.epsi.i1cap2024.banquise.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.checkerframework.checker.units.qual.C;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class TestBanquise {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu-banque");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        Set<Compte> comptesHamza = new HashSet<>();

        Set<Operation> operationsHamza = new HashSet<>();


//        Adresse
        Adresse adresse = new Adresse(215,"Rue de la Payx", 34000, "Montpellier");
        Adresse adresseHamza = new Adresse(218,"Rue de la croix", 34000, "Montpellier");

//       Nouvelle banque :
        Banque boursoBank = new Banque("boursoBank");

//       Création du compte commun Couple
        Compte compte = new Compte("2525452",545.0);
        Set<Compte> comptes = new HashSet<>();
        comptes.add(compte);




        Set<Client> clientHamza = new HashSet<>();


        LivretA livretAHamza = new LivretA("555888", 200.0, clientHamza, operationsHamza, 15.0);

        AssuranceVie assuranceVieHamza = new AssuranceVie("555999", 155.0, clientHamza , operationsHamza,LocalDate.parse ("2050-01-08"), 15.0);
        Compte compteCourantHamza = new Compte("555444", 400000.0,  clientHamza , operationsHamza);

        Operation operationNormalHamza = new Operation(LocalDate.now(), 60.0, "je dois rendre l'argent", compteCourantHamza);
        Virement operationVirementHamza =  new Virement(LocalDate.now(), 56.5, "Il me doit de la tune ce fou",compteCourantHamza,"Jack" );
        operationsHamza.add(operationNormalHamza);
        operationsHamza.add(operationVirementHamza);
        comptesHamza.add(livretAHamza);
        comptesHamza.add(assuranceVieHamza);
        comptesHamza.add(compteCourantHamza);

        Client hamza = new Client("Benalia", "Hamza", LocalDate.now(), boursoBank,comptesHamza, adresseHamza);
        clientHamza.add(hamza);




        Client Kevin = new Client("Barbin", "Kevin", LocalDate.now(), boursoBank, comptes, adresse);
        Client Steven = new Client("RICA", "Steven", LocalDate.now(),  boursoBank, comptes, adresse);







        entityManager.persist(hamza);
        entityManager.persist(compteCourantHamza);

        entityManager.persist(assuranceVieHamza);
        entityManager.persist(livretAHamza);

        entityManager.persist(compteCourantHamza);
        entityManager.persist(operationNormalHamza);
        entityManager.persist(operationVirementHamza);



        entityManager.persist(boursoBank);
        entityManager.persist(compte);
        entityManager.persist(Kevin);
        entityManager.persist(Steven);

        entityManager.getTransaction().commit();


        entityManager.close();
        emf.close();
    }
}
