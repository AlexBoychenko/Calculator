
import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class test {

    @Test
    public void testSum() {
        // Given
        Calculator calculator = new Calculator();
        // When
        int result = calculator.sum(2, 2);
        // Then
        if (result != 4) {   // if 2 + 2 != 4
            Assertions.fail("fail");
        }
    }

    @Test
    public void testMinus() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.minus(2, 2));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(6, 3));
    }

    @Test()
    public void testDivideOnZero() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.divide(6, 0));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.multiply(2, 0));
    }

    @Test
    public void testMultiply1() {
        Calculator calculator = new Calculator();
        assertEquals(-6, calculator.multiply(2, -3));
    }

}