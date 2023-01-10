package designpattern.behavioural.observer;

public class Utilisation {
    public static void main(String[] args){
        Entier unEntier = new Entier(8);
        Label premierLabel = new Label(unEntier);
        Label secondLabel = new Label (unEntier);

        System.out.println(unEntier);
        unEntier.setValeur(22);

        unEntier.removeObserver(premierLabel);
        unEntier.setValeur(153);
    }
}
