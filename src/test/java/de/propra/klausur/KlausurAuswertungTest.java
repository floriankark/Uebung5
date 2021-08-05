package de.propra.klausur;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class KlausurAuswertungTest {

    public static List<Ergebnis> createTestErgebnisse() {
        return List.of(
                new Ergebnis(7, 1234),
                new Ergebnis(4, 2345),
                new Ergebnis(12, 3456),
                new Ergebnis(22, 4567)
        );
    }

    @Test
    @DisplayName("Anzahl bestandener Studierender ist immer null bei leerer Liste")
    void getAnzahlBestanden_leereListeGibtImmerNull() {
        //Arrange
        List<Ergebnis> le = new ArrayList<>();
        //Act
        int anzahl = KlausurAuswertung.getAnzahlBestanden(le,0);
        //Assert
        assertThat(anzahl).isEqualTo(0);
    }


    @Test
    @DisplayName("Eine Person besteht")
    void getAnzahlBestanden_eineBestandenePerson() {
        //Arrange
        //Act
        int anzahl = KlausurAuswertung.getAnzahlBestanden(createTestErgebnisse(), 20);
        //Assert
        assertThat(anzahl).isEqualTo(1);
    }

    @Test
    void getPunkteDurchschnitt_XYZ() {
        //Arrange
        //Act
        double durchschnitt = KlausurAuswertung.getPunkteDurchschnitt(createTestErgebnisse());
        //Assert
        assertThat(durchschnitt).isCloseTo(11.25, Offset.offset(0.1));
    }
/*
    @Test
    void getBestandeneStudis_XYZ() {
        //Arrange
        Ergebnis e1 = new Ergebnis(12, 3456);
        Ergebnis e2 = new Ergebnis(22, 4567);
        //Act
        List<Ergebnis> bestanden = KlausurAuswertung.getBestandeneStudis(createTestErgebnisse(), 10);
        //Assert
        assertThat(bestanden).containsExactly(createTestErgebnisse().get(2));
        //assertThat(bestanden).containsAll(List.of(e1, e2));
    }*/
}