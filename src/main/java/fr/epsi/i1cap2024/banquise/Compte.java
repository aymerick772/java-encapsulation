package fr.epsi.i1cap2024.banquise;

import jakarta.persistence.*;
import org.checkerframework.checker.units.qual.C;

import java.util.HashSet;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "compte")
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name="numero")
    private String numero;
    @Column(name="solde")
    private Double solde;

    @ManyToMany(mappedBy = "comptes")
    private Set<Client> clients;

    @OneToMany(mappedBy = "compte")
    private Set<Operation> operation = new HashSet<>();

    public Compte() {
    }

    public Compte( String numero, Double solde, Set<Client> clients) {
        this.numero = numero;
        this.solde = solde;
        this.clients = clients;
    }

    public Compte(String numero, Double solde, Set<Client> clients, Set<Operation> operation) {
        this.numero = numero;
        this.solde = solde;
        this.clients = clients;
        this.operation = operation;
    }

    public Compte(String numero, Double solde) {
        this.numero = numero;
        this.solde = solde;
    }


    //    public Compte(String numero, Double solde) {
    //
    //        this.numero = numero;
    //        this.solde = solde;
    //    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

    public Set<Operation> getOperation() {
        return operation;
    }

    public void setOperation(Set<Operation> operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", solde=" + solde +
                ", clients=" + clients +
                ", operation=" + operation +
                '}';
    }
}
