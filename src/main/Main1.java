package main;

import Models.Employe;
import Models.Interimaires;
import Models.Salaries;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main1 {

    public static void main(String[] args) throws Exception{
        Employe[] e = new Employe[2];
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        e[0] = new Interimaires( "0045RF",  "Koro",
                "Kokou",  LocalDate.parse("03/02/1998",df),
                LocalDate.parse("03/06/2018",df),  130, 0);

        e[1] = new Salaries( "0045RF",  "Koro",
                "Kokou",  LocalDate.parse("03/02/1998",df),
                LocalDate.parse("03/06/2018",df),  250000, 75000);

        System.out.println(e[0]);
        System.out.println(e[1]);

        Interimaires.setTauxHoraire(8000);
        Interimaires.setTauxHoraireSup(6000);
        for (Employe em: e) {
            System.out.println(em.calculSalaire());
        }
        show(e[0]);
        show(e[1]);
    }

    public static void show(Employe e) {
        System.out.println(e);
    }
}
