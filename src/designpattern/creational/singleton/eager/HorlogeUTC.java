package designpattern.creational.singleton.eager;

public class HorlogeUTC {
    private int nbHeures;
    private int nbMinutes;
    private int nbSecondes;


    private static final HorlogeUTC horloge = new HorlogeUTC();

    public static HorlogeUTC getInstance(){
        return horloge;
    }

    private HorlogeUTC() {
        nbHeures=0;
        nbMinutes=0;
        nbSecondes=0;
        System.out.println("Instanciation d'un HorlogeUTC Eager");
    }

    public static void disBonjour(){
        System.out.println("Bonjour de la part de Eager");
    }

    @Override
    public String toString() {
        return "HorlogeUTC{" +
                "nbHeures=" + nbHeures +
                ", nbMinutes=" + nbMinutes +
                ", nbSecondes=" + nbSecondes +
                '}';
    }

    public void tic(){
        nbSecondes++;
        if (nbSecondes==60){
            nbSecondes=0;
            nbMinutes++;
            if (nbMinutes==60){
                nbMinutes=0;
                nbHeures++;
                if (nbHeures==24){
                    nbHeures = 0;
                }
            }
        }
    }
}
