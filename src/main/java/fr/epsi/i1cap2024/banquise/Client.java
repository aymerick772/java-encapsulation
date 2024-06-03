package fr.epsi.i1cap2024.banquise;

import jakarta.persistence.*;
import org.checkerframework.checker.units.qual.A;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NOM")
    private String nom;
    @Column(name = "PRENOM")
    private String prenom;
    @Column(name="DATENAISSANCE")
    private LocalDate dateNaissance;

    @ManyToOne
    @JoinColumn(name = "BANQUE_ID")
    private Banque banque;

    @ManyToMany
    @JoinTable(name="CLI_CPT",
        joinColumns = @JoinColumn(name="ID_CLI", referencedColumnName = "ID"),
        inverseJoinColumns = @JoinColumn(name="ID_CPT",referencedColumnName = "ID")
    )
    private Set<Compte> comptes = new HashSet<>();



    @Embedded
    private Adresse adresse;

    public Client() {
    }

    public Client( String nom, String prenom, LocalDate dateNaissance, Banque banque, Set<Compte> comptes, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.banque = banque;
        this.comptes = comptes;
        this.adresse = adresse;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Banque getBanque() {
        return banque;
    }

    public void setBanque(Banque banque) {
        this.banque = banque;
    }

    public Set<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(Set<Compte> comptes) {
        this.comptes = comptes;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", banque=" + banque +
                ", comptes=" + comptes +
                ", adresse=" + adresse +
                '}';
    }
}
