package fr.epsi.i1cap2024.banquise;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.checkerframework.checker.units.qual.C;

@Embeddable
public class Adresse {
    @Column(name = "NUMERO")
    private int numero;
    @Column(name = "RUE")
    private String rue;
    @Column(name = "CODEPOSTAL")
    private int codePostal;
    @Column(name = "VILLE")
    private String ville;

    public Adresse() {
    }

    public Adresse(int numero, String rue, int codePostal, String ville) {
        this.numero = numero;
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

}
