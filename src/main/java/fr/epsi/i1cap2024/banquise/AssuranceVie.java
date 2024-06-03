package fr.epsi.i1cap2024.banquise;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.util.Set;

@Entity
@DiscriminatorValue("AV")
public class AssuranceVie extends Compte{
    @Column(name="DATEFIN")
    private LocalDate dateFin;
    @Column(name="TAUX")
    private double taux;

    public AssuranceVie() {
    }

    public AssuranceVie(String numero, Double solde) {
        super(numero, solde);
    }

    public AssuranceVie(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public AssuranceVie(String numero, Double solde, LocalDate dateFin) {
        super(numero, solde);
        this.dateFin = dateFin;
    }

    public AssuranceVie(LocalDate dateFin, double taux) {
        this.dateFin = dateFin;
        this.taux = taux;
    }

    public AssuranceVie(String numero, Double solde, Set<Client> clients, LocalDate dateFin, double taux) {
        super(numero, solde, clients);
        this.dateFin = dateFin;
        this.taux = taux;
    }

    public AssuranceVie(String numero, Double solde, Set<Client> clients, Set<Operation> operation, LocalDate dateFin, double taux) {
        super(numero, solde, clients, operation);
        this.dateFin = dateFin;
        this.taux = taux;
    }

    public AssuranceVie(String numero, Double solde, LocalDate dateFin, double taux) {
        super(numero, solde);
        this.dateFin = dateFin;
        this.taux = taux;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }
}

//join quand je sais qu'il n'y aura pas
//
//
//single table  quand il a bcp d'operation

//Paramètre nommé
// Paramètre nommé
//Query query = em.createQuery("SELECT p FROM Person p WHERE p.name= :name");
//query.setParameter("name", "Doe");
//
//Ou paramètre positionnel comme en JDBC
//Query query = em.createQuery("SELECT p FROM Person p WHERE p.name = ?");
//query.setParameter(1, "Doe");