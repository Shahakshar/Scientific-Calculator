import org.example.DevCal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DevCalTest {

    @Test
    void testSquareRoot() {
        assertEquals(5.0, DevCal.squareRoot(25), 0.0001);
    }

    @Test
    void testFactorial() {
        assertEquals(120, DevCal.factorial(5));
    }

    @Test
    void testLogarithm() {
        assertEquals(0.0, DevCal.logarithm(1), 0.0001);
    }

    @Test
    void testPower() {
        assertEquals(8.0, DevCal.power(2, 3), 0.0001);
    }

    @Test
    void testNegativeSquareRoot() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            DevCal.squareRoot(-9);
        });
        assertEquals("Invalid Number", exception.getMessage());
    }

    @Test
    void testNegativeLogarithm() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            DevCal.logarithm(-5);
        });
        assertEquals("Logarithm undefined for non-positive numbers", exception.getMessage());
    }

    @Test
    void testNegativeFactorial() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            DevCal.factorial(-3);
        });
        assertEquals("Invalid Number", exception.getMessage());
    }

}
