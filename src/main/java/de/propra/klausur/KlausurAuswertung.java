package de.propra.klausur;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class KlausurAuswertung {
    public static int getAnzahlBestanden(List<Ergebnis> ergebnisse, int bestehensGrenze) {
        return (int) ergebnisse.stream().filter(x -> x.getPunkte() >= bestehensGrenze).count();
    }

    public static double getPunkteDurchschnitt(List<Ergebnis> ergebnisse) {
        int laenge = ergebnisse.size();
        int sum = ergebnisse.stream().mapToInt(Ergebnis::getPunkte).sum();
        return (double) sum/laenge;
    }


    public static List<Ergebnis> getBestandeneStudis(List<Ergebnis> ergebnisse, int bestehensGrenze) {
        //List<Ergebnis> l = new ArrayList<>();
        return ergebnisse.stream().filter(x -> x.getPunkte() >= bestehensGrenze).collect(Collectors.toList());
        //return l;
    }
}