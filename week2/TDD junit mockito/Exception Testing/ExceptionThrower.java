package org.example;

public class ExceptionThrower {

    public void throwException(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be null or empty");
        }

        //if input is valid
        System.out.println("Valid input: " + input);
    }
}
