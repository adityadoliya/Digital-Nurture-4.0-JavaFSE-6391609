package com.aditya.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorServiceTest {

	@Autowired
	private CalculatorService calculatorService;

	@Test
	public void testAdd() {
		int result = calculatorService.add(5, 7);
		assertEquals(12, result);
	}
}
