package fr.epsi.i1cap2024.bo;

import jakarta.persistence.*;

@Entity
@Table (name = "fournisseur")
public class Fournisseur {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id ;
    @Column(name="NOM")
    private String raisonSocial;


    public Fournisseur() {
    }

    public Fournisseur(String raisonSocial) {
        this.raisonSocial = raisonSocial;
    }

    public Integer getId() {
        return id;
    }

    public String getRaisonSocial() {
        return raisonSocial;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setRaisonSocial(String raisonSocial) {
        this.raisonSocial = raisonSocial;
    }
}
