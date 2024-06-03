package fr.epsi.i1cap2024.banquise;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@DiscriminatorValue("LA")
public class LivretA extends Compte{
    @Column(name = "TAUX")
    private double taux;

    public LivretA() {
    }

    public LivretA(String numero, Double solde) {
        super(numero, solde);
    }

    public LivretA(double taux) {
        this.taux = taux;
    }

    public LivretA(String numero, Double solde, Set<Client> clients, double taux) {
        super(numero, solde, clients);
        this.taux = taux;
    }

    public LivretA(String numero, Double solde, Set<Client> clients, Set<Operation> operation, double taux) {
        super(numero, solde, clients, operation);
        this.taux = taux;
    }

    public LivretA(String numero, Double solde, double taux) {
        super(numero, solde);
        this.taux = taux;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }
}
