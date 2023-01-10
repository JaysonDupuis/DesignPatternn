package designpattern.creational.singleton.pasbo;

public class HorlogeUTC {
    private int nbHeures;
    private int nbMinutes;
    private int nbSecondes;

    public HorlogeUTC() {
        nbHeures=0;
        nbMinutes=0;
        nbSecondes=0;
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
