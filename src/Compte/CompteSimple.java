package Compte;

public class CompteSimple extends Compte{
    private int decouvert;

    public CompteSimple(int decouvert) {
        this.decouvert = decouvert;
    }

    public CompteSimple(double soldes, int decouvert) {
        super(soldes);
        this.decouvert = decouvert;
    }


    @Override
    public void versement(double montant) {
        super.versement(montant);
    }

    @Override
    public void retrait(double montant) {
        if(montant > super.soldes + this.decouvert) {
            System.out.println("Impossible de retirer " + montant);
        } else {
            super.retrait(montant);
        }
    }
}
