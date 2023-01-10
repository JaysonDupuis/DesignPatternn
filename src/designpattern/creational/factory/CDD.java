package designpattern.creational.factory;

public class CDD implements Employe{

    private String nom;
    private int dureeDuContrat;

    public CDD(String nom, int dureeDuContrat) {
        this.nom = nom;
        this.dureeDuContrat = dureeDuContrat;
    }

    public int getDureeDuContrat() {
        return dureeDuContrat;
    }



    @Override
    public String toString() {
        return "CDD{" +
                "nom='" + nom + '\'' +
                ", dureeDuContrat=" + dureeDuContrat +
                '}';
    }

    @Override
    public String donneTonNom() {
        return null;
    }
}
