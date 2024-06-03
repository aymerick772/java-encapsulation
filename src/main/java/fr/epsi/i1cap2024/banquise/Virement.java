package fr.epsi.i1cap2024.banquise;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@DiscriminatorValue("E")
public class Virement extends Operation{

    @Id
    @Column(name = "ID")
    private Integer id;
    @Column(name ="BENEFICIAIRE")
    private String beneficiaire;

    public Virement() {
    }

    public Virement(String beneficiaire) {
        this.beneficiaire = beneficiaire;
    }

    public Virement(LocalDate date, Double montant, String motif, Compte compte, String beneficiaire) {
        super(date, montant, motif, compte);
        this.beneficiaire = beneficiaire;
    }

//    public Virement(LocalDate date, Double montant, String motif, String beneficiaire) {
//        super(date, montant, motif);
//        this.beneficiaire = beneficiaire;
//    }


    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getBeneficiaire() {
        return beneficiaire;
    }

    public void setBeneficiaire(String beneficiaire) {
        this.beneficiaire = beneficiaire;
    }
}
