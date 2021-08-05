package de.propra.klausur;


public class Ergebnis {
    private int punkte;
    private int matrikelNummer;

    public Ergebnis(int punkte, int matrikelNummer) {
        this.punkte = punkte;
        this.matrikelNummer = matrikelNummer;
    }

    public int getPunkte() {
        return punkte;
    }

    public int getMatrikelNummer() {
        return matrikelNummer;
    }
}
