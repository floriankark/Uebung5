package de.propra.klausur;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

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
        //Act
        //Assert
    }

    @Test
    @DisplayName("Eine Person besteht")
    void getAnzahlBestanden_eineBestandenePerson() {
        //Arrange
        //Act
        //Assert
    }

    @Test
    void getPunkteDurchschnitt_XYZ() {
        //Arrange
        //Act
        //Assert
    }

    @Test
    void getBestandeneStudis_XYZ() {
        //Arrange
        //Act
        //Assert
    }
}