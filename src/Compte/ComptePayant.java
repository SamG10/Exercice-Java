package Compte;

public class ComptePayant extends Compte {
    public ComptePayant() {
    }

    public ComptePayant(double soldes) {
        super(soldes);
    }

    public void retrait(double montant) {
        super.retrait(montant);
        super.setSoldes(super.getSoldes() * 0.95);
    }

    public void versement(double montant) {
        super.versement(montant);
        super.setSoldes(super.getSoldes() * 0.95);
    }
}
