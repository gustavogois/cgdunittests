package cgd.pt.cgdunittests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testSum() {

        Calculator calculator = new Calculator();

        int result = calculator.sum(3, 4);

        assertEquals(7, result);
    }
}
