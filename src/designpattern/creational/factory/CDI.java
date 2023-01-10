package designpattern.creational.factory;

public class CDI implements Employe {

    private String nom;
    private String avantages;

    public CDI(String nom, String avantages) {
        this.nom = nom;
        this.avantages = avantages;
    }

    public String getAvantages() {
        return avantages;
    }

    @Override
    public String donneTonNom() {
        return null;
    }

    @Override
    public String toString() {
        return "CDI{" +
                "nom='" + nom + '\'' +
                ", avantages='" + avantages + '\'' +
                '}';
    }
}
