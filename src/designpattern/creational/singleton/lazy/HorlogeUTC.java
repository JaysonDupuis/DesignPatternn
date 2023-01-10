package designpattern.creational.singleton.lazy;

public class HorlogeUTC {
    private int nbHeures;
    private int nbMinutes;
    private int nbSecondes;


    private static HorlogeUTC horloge = null;

    public static HorlogeUTC getInstance(){
        if(horloge == null){
            horloge = new HorlogeUTC();
        }
        return horloge;
    }

    private HorlogeUTC() {
        nbHeures=0;
        nbMinutes=0;
        nbSecondes=0;
        System.out.println("Instanciation d'un HorlogeUTC Lazy");
    }

    public static void disBonjour(){
        System.out.println("Bonjour de la part de Lazy");
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
