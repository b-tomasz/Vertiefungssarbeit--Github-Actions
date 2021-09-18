package ch.teko.prg2.day04.test.test;

import java.util.ArrayList;

public class Parkhaus {
    private ArrayList<Parkplatz> parkplaetze;


    public Parkhaus(ArrayList<Parkplatz>  parkplaetze) {
        this.parkplaetze = parkplaetze;
    }

    public ArrayList<Parkplatz>  getParkplaetze() {
        return parkplaetze;
    }
}


import java.util.HashMap;

public class Abteilung {
    private String name;
    private HashMap<Long, Artikel> arikelListe;

    public Abteilung(String name, HashMap<Long, Artikel> arikelListe) {
        this.name = name;
        this.arikelListe = arikelListe;
    }

    public String getName() {
        return name;
    }

    public HashMap<Long, Artikel> getArikelListe() {
        return arikelListe;
    }

}

