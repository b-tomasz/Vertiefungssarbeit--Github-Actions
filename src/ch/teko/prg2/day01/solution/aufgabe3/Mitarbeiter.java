package ch.teko.prg2.day01.solution.aufgabe3;

public class Mitarbeiter extends Person {

    private int mitarbeiterID;

    public Mitarbeiter(String name, String vorname, int alter, int gehalt, int ferien, int mitarbeiterID) {
        super(name, vorname, alter, gehalt, ferien);
        this.mitarbeiterID = mitarbeiterID;
    }

    public int getMitarbeiterID() {
        return mitarbeiterID;
    }
}
