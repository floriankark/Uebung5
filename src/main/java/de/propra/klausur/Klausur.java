package de.propra.klausur;

import java.util.List;

public class Klausur {
    private List<Ergebnis> ergebnisse;
    private Integer bestehensGrenze;
    private Double punkteDurchschnitt;
    private List<Ergebnis> bestandeneStudis;

    public Klausur(List<Ergebnis> ergebnisse, Integer bestehensGrenze) {
        this.ergebnisse = ergebnisse;
        this.bestehensGrenze = bestehensGrenze;
        this.punkteDurchschnitt = KlausurAuswertung.getPunkteDurchschnitt(ergebnisse);
        bestandeneStudis = KlausurAuswertung.getBestandeneStudis(ergebnisse, bestehensGrenze);
    }

    public void changeBestehensGrenze(Integer neueGrenze) {
        // TODO: implementiere mich
        throw new UnsupportedOperationException("Not Implemented yet");
    }

    public Double getPunkteDurchschnitt() {
        return punkteDurchschnitt;
    }

    public List<Ergebnis> getBestandeneStudis() {
        return bestandeneStudis;
    }
}
