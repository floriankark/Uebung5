package de.propra.klausur;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class KlausurTest {
    public static List<Ergebnis> createTestErgebnisse() {
        return List.of(
                new Ergebnis(7, 1234),
                new Ergebnis(4, 2345),
                new Ergebnis(12, 3456),
                new Ergebnis(22, 4567)
        );
    }

    @Test
    void getPunkteDurchschnittTest() {
        //Arrange
        Klausur k = new Klausur(createTestErgebnisse(), 10);
        //Act
        double d = k.getPunkteDurchschnitt();
        //Assert
        assertThat(d).isCloseTo(11.25, Offset.offset(0.1));
    }

    @Test
    void punkteDurchschnittIsSame() {
        //Arrange
        Klausur k = new Klausur(createTestErgebnisse(), 10);
        //Act
        double d = k.getPunkteDurchschnitt();
        double durchschnitt = KlausurAuswertung.getPunkteDurchschnitt(createTestErgebnisse());
        //Assert
        assertThat(d).isCloseTo(durchschnitt, Offset.offset(0.1));
    }

    @Test
    void changeBestehensGrenzeTest() {
        //Arrange
        Klausur k = new Klausur(createTestErgebnisse(), 15);
        //Act
        k.changeBestehensGrenze(12);
        int l = k.getBestandeneStudis().size();
        //Assert
        assertThat(l).isEqualTo(2);
    }

    @Test
    void punkteDurchschnittDoesNotChange() {
        Klausur k = new Klausur(createTestErgebnisse(), 15);
        //Act
        double d = k.getPunkteDurchschnitt();
        k.changeBestehensGrenze(12);
        //Assert
        assertThat(k.getPunkteDurchschnitt()).isCloseTo(d, Offset.offset(0.1));
    }

}