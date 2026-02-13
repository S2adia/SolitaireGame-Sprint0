import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    void TwoPlusTwoEqualsFour() {
        var calculator = new SimpleCalculator();
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    void ThreePlusFourEqualsSeven() {
        var calculator = new SimpleCalculator();
        assertEquals(7, calculator.add(3, 4));
    }

    @Test
    void FiveMinusTwoEqualsThree() {
        var calculator = new SimpleCalculator();
        assertEquals(3, calculator.subtract(5, 2));
    }

    @Test
    void ThreeMinusThreeEqualsZero() {
        var calculator = new SimpleCalculator();
        assertEquals(0, calculator.subtract(3, 3));
    }


}