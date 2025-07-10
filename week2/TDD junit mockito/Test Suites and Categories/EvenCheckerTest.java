package org.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenCheckerTest {

    EvenChecker checker = new EvenChecker();

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 6391608}) // My superset id is not even i.e. 6391609
    @Tag("fast")
    void testIsEven(int number) {
        assertTrue(checker.isEven(number), number + " should be even");
    }
}
