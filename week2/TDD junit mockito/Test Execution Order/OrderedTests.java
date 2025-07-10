package org.example;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {

    SimpleSteps steps = new SimpleSteps();

    @Test
    @Order(1)
    void testStepOne() {
        assertEquals("Step 1 completed ,hello from 6391609", steps.stepOne());
    }

    @Test
    @Order(2)
    void testStepTwo() {
        assertEquals("Step 2 completed ,namaste from 6391609", steps.stepTwo());
    }

    @Test
    @Order(3)
    void testStepThree() {
        assertEquals("Step 3 completed ,bonjour from 6391609", steps.stepThree());
    }
}

