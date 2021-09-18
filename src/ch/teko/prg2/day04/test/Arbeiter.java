package ch.teko.prg2.day04.test;

public class Arbeiter extends Mitarbeiter {

    private double studentenLohn;
    private double anzahlStunden;

    public Arbeiter(int persNr, String name, int dienstalter, double studentenLohn, double anzahlStunden) {
        super(persNr, name, dienstalter);
        this.studentenLohn = studentenLohn;
        this.anzahlStunden = anzahlStunden;
    }

    public double monatsBrutto() {
        return studentenLohn * anzahlStunden;
    }

}
