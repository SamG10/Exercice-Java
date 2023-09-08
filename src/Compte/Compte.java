package Compte;

public class Compte {
    protected int code;
    protected double soldes;
    private static int count;
    protected double montant;

    {
        ++count;
    }

    public Compte() {
        this.code = count;
    }

    public Compte(double soldes) {
        this.code = count;
        this.soldes = soldes;
    }

    public double getSoldes() {
        return soldes;
    }

    public void setSoldes(double soldes) {
        this.soldes = soldes;
    }

    public void versement(double montant) {
        setSoldes(this.soldes += montant);
    }

    public void retrait(double montant) {
        setSoldes(this.soldes -= montant);
    }

    @Override
    public String toString() {
        return "Compte{" +
                "code=" + code +
                ", soldes=" + soldes +
                ", montant=" + montant +
                '}';
    }
}
