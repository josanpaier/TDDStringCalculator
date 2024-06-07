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
    void add_returnSum_whenStringNumberHasOnlyTwoNumber() {
        //Arrange
        String numbers = "1,2";

        //Act
        int result = StringCalculator.add(numbers);

        //Assert
        assertEquals(3, result);
    }

    @Test
    void add_returnSum_whenStringNumberHasUnknownAmountOfNumbers() {
        //Arrange
        String numbers = "2,4,6,8";

        //Act
        int result = StringCalculator.add(numbers);

        //Assert
        assertEquals(20, result);
    }

    @Test
    void add_returnSum_whenStringNumberHasNewLines() {
        //Arrange
        String numbers = "2,4\n6,8\n3,7\n5,5";

        //Act
        int result = StringCalculator.add(numbers);

        //Assert
        assertEquals(40, result);
    }

    @Test
    void add_returnSum_whenStringNumberHasNumberLineNumber1() {
        //Arrange
        String numbers = "1\n2";

        //Act
        int result = StringCalculator.add(numbers);

        //Assert
        assertEquals(3, result);
    }

    @Test
    void add_returnSum_whenStringNumberHasNumberLineNumber2() {
        //Arrange
        String numbers = "1\n2,3";

        //Act
        int result = StringCalculator.add(numbers);

        //Assert
        assertEquals(6, result);
    }

    /*
    @Test
    void add_returnSum_whenStringNumberHasDifferentDelimiters() {
        //Arrange
        String numbers = "//;\n1;2";

        //Act
        int result = StringCalculator.add(numbers);

        //Assert
        assertEquals(3, result);
    }
     */

}