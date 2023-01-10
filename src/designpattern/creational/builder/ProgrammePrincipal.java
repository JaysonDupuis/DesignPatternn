package designpattern.creational.builder;

public class ProgrammePrincipal {
    public static void main(String[] args) {
        //LourdeEtComplexe lc = new LourdeEtComplexe(1, "toto", true);  <-- Ne se compile pas car
        // le constructeur a été privatisé

        LourdeEtComplexe.Builder monBuilder = new LourdeEtComplexe.Builder();

        LourdeEtComplexe lc =
                monBuilder
                        .setPremierAttribut(1)
                        .setSecondAttribut("toto")
                        .setTroisiemeAttribut(true)
                        .build();
    }
}
