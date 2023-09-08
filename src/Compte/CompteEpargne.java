package Compte;

public class CompteEpargne extends Compte {
    private int TauxInteret;


    public CompteEpargne(int tauxInteret) {
        TauxInteret = tauxInteret;
    }

    public CompteEpargne(double soldes, int tauxInteret) {
        super(soldes);
        TauxInteret = tauxInteret;
    }

    public void calculInteret() {
        super.setSoldes(this.soldes += this.TauxInteret);
    }
}
