package Chaise;

import java.util.ArrayList;
import java.util.List;

public class Objet {
    private String nom;
    private int nbPied;
    private String couleur;
    private String materiaux;

    public Objet(String nom, int nbPied, String couleur, String materiaux) {
        this.nom = nom;
        this.nbPied = nbPied;
        this.couleur = couleur;
        this.materiaux = materiaux;
    }

    public Objet(String nom) {
        this.nom = nom;
    }

    public String toString() {
        return "Objet [nom=" + nom + ", nbPied=" + nbPied + ", couleur=" + couleur + ", materiaux=" + materiaux + "]";
    }
}
