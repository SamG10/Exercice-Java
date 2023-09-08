package Compte;

public class Main {
    public static void main(String[] args) {
        Compte compte = new Compte(20);
        Compte compte2 = new Compte(40);
        System.out.println(compte);
        System.out.println(compte2);

        CompteSimple compteSimple = new CompteSimple(20, 10);
        System.out.println(compteSimple);
        compteSimple.retrait(30);
        System.out.println(compteSimple);
        CompteEpargne compteEpargne = new CompteEpargne(50, 5);
        System.out.println(compteEpargne);
        compteEpargne.calculInteret();
        System.out.println(compteEpargne.getSoldes());
        ComptePayant comptePayant = new ComptePayant(100);
        comptePayant.retrait(10);
        System.out.println(comptePayant.getSoldes());
        comptePayant.versement(30);
        System.out.println(comptePayant.getSoldes());
    }
}
