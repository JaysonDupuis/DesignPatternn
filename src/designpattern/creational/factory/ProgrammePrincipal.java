package designpattern.creational.factory;

import java.util.List;

public class ProgrammePrincipal {
    public static void main(String[] args) {

        EmployeFactory monUsine = new EmployeFactory();

        Employe emp1 = monUsine.create("cdd", "Toto", 12);
        Employe emp2 = monUsine.create("cdi", "Tutu", "Ticket Resto");


        List<Employe> pleinDEmployes=List.of(emp1,emp2);


        pleinDEmployes.forEach(e->{
            System.out.println(e.donneTonNom());
        });
    }
}
