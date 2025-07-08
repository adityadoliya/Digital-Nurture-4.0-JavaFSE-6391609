import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        int result = 6391 + 609; // SupersetID-6391609
        assertEquals(7000, result);
    }

    @Test
    public void testSubtraction() {
        int result = 6391 - 609;
        assertEquals("Subtraction of Superset ID", 5782, result);
    }
}

