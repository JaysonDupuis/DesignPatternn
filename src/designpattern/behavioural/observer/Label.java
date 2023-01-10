package designpattern.behavioural.observer;

public class Label implements Observer{

    private Entier entier;
    private String chaine;

    public Label(Entier entier) {
        chaine = "";
        this.entier = entier;
        entier.addObserver(this);
    }

    @Override
    public void update() {
        //this.chaine = ""+entier.getValeur(); ps beau

        //this.chaine = String.valueOf(entier.getValeur());
        this.chaine = Integer.toString(entier.getValeur());

        System.out.println("La valeur a changé : "+entier.getValeur());
    }
}
