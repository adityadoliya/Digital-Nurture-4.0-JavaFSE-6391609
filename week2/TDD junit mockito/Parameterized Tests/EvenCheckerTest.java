package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenCheckerTest {

    EvenChecker checker = new EvenChecker();

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10, 0, -2, 6391608}) // multiple even numbers including part of your Superset ID
    void testIsEven(int input) {
        // Act & Assert
        assertTrue(checker.isEven(input), input + " should be even");
    }
}
