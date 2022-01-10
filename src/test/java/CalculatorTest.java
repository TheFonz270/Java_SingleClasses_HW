import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void additionTest(){
        assertEquals(5 , calculator.add(2,3));
    }

    @Test
    public void subtractionTest(){
        assertEquals(2 , calculator.subtract(4,2));
    }

    @Test
    public void multiplicationTest(){
        assertEquals(10 , calculator.multiply(5,2));
    }

    @Test
    public void divisionTest(){
        assertEquals(3 , calculator.divide(9.9, 3.3), 0.001);
    }
}
