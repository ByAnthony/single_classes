import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void addNumbers(){
        assertEquals(7, calculator.add(2, 5));
    }

    @Test
    public void subtractNumbers(){
        assertEquals(-3, calculator.subtract(2, 5));
    }

    @Test
    public void multiplyNumbers(){
        assertEquals(10, calculator.multiply(2, 5));
    }

    @Test
    public void divideNumbers(){
        assertEquals(0.4, calculator.divide(2, 5), 0.0);
    }

}
