package designpattern.creational.singleton.pasbo;

public class UtilisationHorlogeUTC {
    public static void main(String[] args) {
        HorlogeUTC h1 = new HorlogeUTC();
        System.out.println(h1);

        h1.tic();
        h1.tic();
        h1.tic();
        h1.tic();

        System.out.println(h1);

        HorlogeUTC h2 = new HorlogeUTC();
        System.out.println("h2 = "+ h2);
    }
}
