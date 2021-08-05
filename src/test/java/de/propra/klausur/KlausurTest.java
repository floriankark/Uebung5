package de.propra.klausur;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

@Disabled
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
        //Act
        //Assert
    }

    @Test
    void punkteDurchschnittIsSame() {
        //Arrange
        //Act
        //Assert
    }

    @Test
    void changeBestehensGrenzeTest() {
        //Arrange
        //Act
        //Assert
    }

    @Test
    void punkteDurchschnittDoesNotChange() {
        //Arrange
        //Act
        //Assert
    }

}