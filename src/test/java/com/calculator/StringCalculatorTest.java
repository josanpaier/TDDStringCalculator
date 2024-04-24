package com.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCalculatorTest {

    @Test
    void add_return0_whenStringNumbersIsEmpty() {
        //Arrange
        String numbers = "";

        //Act
        int result = StringCalculator.add(numbers);

        //Assert
        assertEquals(0, result);
    }

    @Test
    void add_returnSelfNumber_whenStringNumberHasOnlyOneNumber() {
        //Arrange
        String numbers = "1";

        //Act
        int result = StringCalculator.add(numbers);

        //Assert
        assertEquals(1, result);
    }

    @Test
    void add_returnSelfNumber_whenStringNumberHasOnlyTwoNumber() {
        //Arrange
        String numbers = "1,2";

        //Act
        int result = StringCalculator.add(numbers);

        //Assert
        assertEquals(3, result);
    }

    @Test
    void add_returnSelfNumber_whenStringNumberHasUnknownAmountOfNumbers() {
        //Arrange
        String numbers = "2,4,6,8";

        //Act
        int result = StringCalculator.add(numbers);

        //Assert
        assertEquals(20, result);
    }
}