package designpattern.creational.factory;
import java.util.Objects;

public class EmployeFactory {

    public EmployeFactory(){
    }

    public Employe create(
            String typeEmploye,
            Object ... parametres){

        Employe resultat = null;


        switch(typeEmploye){

            case "cdd" : {
                String nomDuCDD = (String)parametres[0];
                int dureeDuContrat = (Integer) parametres[1];
                resultat = new CDD(nomDuCDD,dureeDuContrat);
            }; break;
            case "cdi" : {
                String nomDuCDI = (String) parametres[0];
                String avantagesCDI = (String) parametres[1];
                resultat = new CDI(nomDuCDI, avantagesCDI);
            }; break;
            default: {resultat = null;}

        }


        return resultat;

    }
}
