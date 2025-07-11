package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionThrowerTest {

    ExceptionThrower thrower = new ExceptionThrower();

    @Test
    void testThrowsExceptionWhenInputIsNull() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            thrower.throwException(null);
        });
        assertEquals("Input cannot be null or empty", ex.getMessage());
    }

    @Test
    void testThrowsExceptionWhenInputIsEmpty() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            thrower.throwException("");
        });
        assertEquals("Input cannot be null or empty", ex.getMessage());
    }

    @Test
    void testValidInput() {
        assertDoesNotThrow(() -> thrower.throwException("Aditya 6391609"));
    }
}
