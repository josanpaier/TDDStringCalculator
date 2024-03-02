package com.calculator;

import static java.lang.Integer.parseInt;

public class StringCalculator {
    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        if (!numbers.contains(",")) {
            return parseInt(numbers);
        }

        var charNumbers = numbers.split(",");
        return parseInt(charNumbers[0]) + parseInt(charNumbers[1]);
    }

}
