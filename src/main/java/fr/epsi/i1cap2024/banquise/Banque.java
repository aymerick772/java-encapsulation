package fr.epsi.i1cap2024.banquise;

import jakarta.persistence.*;
import org.checkerframework.checker.units.qual.C;

import java.util.HashSet;
import java.util.Set;
//pojo

@Entity
@Table(name = "banque")
public class Banque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NOM")
    private String nom;

    @OneToMany(mappedBy = "banque")
    private Set<Client> clients = new HashSet<>();

    public Banque() {
    }

    public Banque(String nom) {
        this.nom = nom;
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

    public Set<Client> getClient() {
        return clients;
    }

    public void setClient(Set<Client> client) {
        this.clients = client;
    }

    @Override
    public String toString() {
        return "Banque{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", client=" + clients +
                '}';
    }
}
