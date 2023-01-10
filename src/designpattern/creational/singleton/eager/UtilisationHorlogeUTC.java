package designpattern.creational.singleton.eager;

public class UtilisationHorlogeUTC {
    public static void main(String[] args) {
        //HorlogeUTC h1 = new HorlogeUTC(); <-- Compile pas

        HorlogeUTC.disBonjour();

        System.exit(-1);

        HorlogeUTC h1 = HorlogeUTC.getInstance();
        System.out.println(h1);

        h1.tic();
        h1.tic();
        h1.tic();
        h1.tic();

        System.out.println(h1);

        HorlogeUTC h2 = HorlogeUTC.getInstance();
        System.out.println("h2 = "+ h2);
    }
}
