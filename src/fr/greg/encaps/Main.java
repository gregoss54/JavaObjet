package fr.greg.encaps;

import fr.greg.encaps.car;

public class Main {

    public static void main(String[]Args) {

        car voiture1 = new car( "Peugeot",
                230,
                20,
                "verte");
        car voiture2 = new car( "porsche",
                250,
                30,
                "jaune");

        System.out.println(voiture1.toString());
        System.out.println(voiture2.toString());
    }
    }



