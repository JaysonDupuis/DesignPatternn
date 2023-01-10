package designpattern.behavioural.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DecouverteIterator {
    public static void main(String[] args) {
        List<String> pleinDeChaine;
        pleinDeChaine = new LinkedList<>();

        pleinDeChaine.add("titi");
        pleinDeChaine.add("toto");
        pleinDeChaine.add("tutu");
        pleinDeChaine.add("abc");

        Iterator<String> monIterateur
                = pleinDeChaine.iterator();

        while(monIterateur.hasNext()){
            String laChaineCourante = monIterateur.next();
            System.out.println(laChaineCourante);
        }


    }
}
