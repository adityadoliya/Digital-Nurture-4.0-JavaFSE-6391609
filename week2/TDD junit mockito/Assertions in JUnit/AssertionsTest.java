package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        int part1 = 6391;
        int part2 = 609;
        int sum = part1 + part2;

        // Assert that the sum is correct
        assertEquals("Sum should be 7000", 7000, sum);

        // Assert that a condition is true
        assertTrue("6391 is greater than 609", part1 > part2);

        // Assert that a condition is false
        assertFalse("6391 is not less than 609", part1 < part2);

        // Assert that a value is null
        String value = null;
        assertNull("Value should be null", value);

        // Assert that a value is not null
        Object obj = new Object();
        assertNotNull("Object should not be null", obj);
    }
}

