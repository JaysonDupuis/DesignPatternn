package designpattern.behavioural.observer;

public class Entier extends Observable{

    private int valeur;

    public Entier(int valeur) {
        this.valeur = valeur;
    }

    public Entier() {
        this(0);
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Entier{" +
                "valeur=" + valeur +
                "} " + super.toString();
    }
}
